.class public Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroid/gov/nist/javax/sip/stack/QueuedMessageDispatchBase;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Dispatch"
.end annotation


# instance fields
.field callIDOrderingStructure:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;

.field callId:Ljava/lang/String;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

.field time:J


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callIDOrderingStructure:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;

    .line 7
    .line 8
    iput-object p3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->time:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getReceptionTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->time:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callIDOrderingStructure:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->getSemaphore()Ljava/util/concurrent/Semaphore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callIDOrderingStructure:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->getMessagesForCallID()Ljava/util/Queue;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 14
    .line 15
    invoke-static {v2}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 24
    .line 25
    invoke-static {v2}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroid/javax/sip/message/Message;

    .line 36
    .line 37
    invoke-interface {v2, v3}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->beforeMessage(Landroid/javax/sip/message/Message;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v2

    .line 45
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v5, "Semaphore acquisition for callId "

    .line 52
    .line 53
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v5, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v5, " interrupted"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v3, v4, v2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 78
    .line 79
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const/16 v4, 0x20

    .line 84
    .line 85
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    new-instance v5, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v6, "semaphore acquired for message "

    .line 98
    .line 99
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-interface {v3, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    :try_start_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 113
    .line 114
    iget-object v3, v3, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 115
    .line 116
    invoke-interface {v3, v2}, Landroid/gov/nist/javax/sip/parser/SIPMessageListener;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-gtz v1, :cond_2

    .line 124
    .line 125
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 126
    .line 127
    invoke-static {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_2

    .line 145
    .line 146
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    new-instance v3, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v5, "CallIDOrderingStructure removed for message "

    .line 153
    .line 154
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v5, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_2
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_3

    .line 178
    .line 179
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    new-instance v3, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v5, "releasing semaphore for message "

    .line 186
    .line 187
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 204
    .line 205
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 216
    .line 217
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    monitor-enter v0

    .line 222
    :try_start_2
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 223
    .line 224
    invoke-static {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 229
    .line 230
    .line 231
    monitor-exit v0

    .line 232
    goto :goto_1

    .line 233
    :catchall_0
    move-exception p0

    .line 234
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 235
    throw p0

    .line 236
    :cond_4
    :goto_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 237
    .line 238
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 243
    .line 244
    if-eqz v0, :cond_8

    .line 245
    .line 246
    :goto_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 247
    .line 248
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 253
    .line 254
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->afterMessage(Landroid/javax/sip/message/Message;)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_4

    .line 258
    .line 259
    :catchall_1
    move-exception v3

    .line 260
    goto/16 :goto_5

    .line 261
    .line 262
    :catch_1
    move-exception v3

    .line 263
    :try_start_3
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    const-string v6, "Error occured processing message"

    .line 268
    .line 269
    invoke-interface {v5, v6, v3}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 270
    .line 271
    .line 272
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-gtz v1, :cond_5

    .line 277
    .line 278
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 279
    .line 280
    invoke-static {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_5

    .line 298
    .line 299
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    new-instance v3, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    const-string v5, "CallIDOrderingStructure removed for message "

    .line 306
    .line 307
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    iget-object v5, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :cond_5
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_6

    .line 331
    .line 332
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    new-instance v3, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    const-string v5, "releasing semaphore for message "

    .line 339
    .line 340
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 357
    .line 358
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_7

    .line 367
    .line 368
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 369
    .line 370
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    monitor-enter v0

    .line 375
    :try_start_4
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 376
    .line 377
    invoke-static {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 382
    .line 383
    .line 384
    monitor-exit v0

    .line 385
    goto :goto_3

    .line 386
    :catchall_2
    move-exception p0

    .line 387
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 388
    throw p0

    .line 389
    :cond_7
    :goto_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 390
    .line 391
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 396
    .line 397
    if-eqz v0, :cond_8

    .line 398
    .line 399
    goto/16 :goto_2

    .line 400
    .line 401
    :cond_8
    :goto_4
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-eqz v0, :cond_9

    .line 410
    .line 411
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    new-instance v1, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const-string v3, "dispatch task done on "

    .line 418
    .line 419
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    const-string v2, " threadname "

    .line 426
    .line 427
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 431
    .line 432
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$300(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/lang/Thread;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    :cond_9
    return-void

    .line 451
    :goto_5
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    if-gtz v1, :cond_a

    .line 456
    .line 457
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 458
    .line 459
    invoke-static {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    iget-object v5, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 464
    .line 465
    invoke-virtual {v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    if-eqz v1, :cond_a

    .line 477
    .line 478
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    new-instance v5, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    const-string v6, "CallIDOrderingStructure removed for message "

    .line 485
    .line 486
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    iget-object v6, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->callId:Ljava/lang/String;

    .line 490
    .line 491
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :cond_a
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-eqz v1, :cond_b

    .line 510
    .line 511
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    new-instance v4, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    const-string v5, "releasing semaphore for message "

    .line 518
    .line 519
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    :cond_b
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 533
    .line 534
    .line 535
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 536
    .line 537
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-eqz v0, :cond_c

    .line 546
    .line 547
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 548
    .line 549
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    monitor-enter v0

    .line 554
    :try_start_5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 555
    .line 556
    invoke-static {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 561
    .line 562
    .line 563
    monitor-exit v0

    .line 564
    goto :goto_6

    .line 565
    :catchall_3
    move-exception p0

    .line 566
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 567
    throw p0

    .line 568
    :cond_c
    :goto_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 569
    .line 570
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 575
    .line 576
    if-eqz v0, :cond_d

    .line 577
    .line 578
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 579
    .line 580
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 581
    .line 582
    .line 583
    move-result-object p0

    .line 584
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 585
    .line 586
    invoke-interface {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->afterMessage(Landroid/javax/sip/message/Message;)V

    .line 587
    .line 588
    .line 589
    :cond_d
    throw v3
.end method
