.class public Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroid/gov/nist/javax/sip/stack/QueuedMessageDispatchBase;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/parser/NioPipelineParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Dispatch"
.end annotation


# instance fields
.field callId:Ljava/lang/String;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

.field time:J

.field unparsedMessage:Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->unparsedMessage:Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;

    .line 7
    .line 8
    iput-object p3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->callId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->time:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getReceptionTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->time:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public run()V
    .locals 8

    .line 1
    const-string v0, "releasing semaphore for message "

    .line 2
    .line 3
    const-string v1, "Problem parsing message "

    .line 4
    .line 5
    const-string v2, "Error occured processing message "

    .line 6
    .line 7
    const-string v3, "\nUnparsed message before parser is:\n"

    .line 8
    .line 9
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v6, "serving msg on call id "

    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v6, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->callId:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    :try_start_0
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v7, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->unparsedMessage:Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;

    .line 55
    .line 56
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v6, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v1

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :catch_0
    move-exception v1

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :catch_1
    move-exception v2

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_0
    :goto_0
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->unparsedMessage:Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;

    .line 77
    .line 78
    iget-object v3, v3, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;->lines:Ljava/lang/String;

    .line 79
    .line 80
    const-string v6, "UTF-8"

    .line 81
    .line 82
    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iget-object v6, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 87
    .line 88
    invoke-static {v6}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$100(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-interface {v6, v3, v7, v7, v5}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    if-nez v5, :cond_1

    .line 98
    .line 99
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_2

    .line 108
    .line 109
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    const-string v6, "parsed message is null, probably because of end of stream, empty packets or socket closed and we got CRLF to terminate cleanly, not processing message"

    .line 114
    .line 115
    invoke-interface {v3, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->unparsedMessage:Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;

    .line 120
    .line 121
    iget-object v3, v3, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;->body:[B

    .line 122
    .line 123
    array-length v6, v3

    .line 124
    if-lez v6, :cond_2

    .line 125
    .line 126
    invoke-virtual {v5, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([B)V

    .line 127
    .line 128
    .line 129
    :cond_2
    :goto_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 130
    .line 131
    invoke-static {v3}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iget-object v3, v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 136
    .line 137
    if-eqz v3, :cond_3

    .line 138
    .line 139
    if-eqz v5, :cond_3

    .line 140
    .line 141
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 142
    .line 143
    invoke-static {v3}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    iget-object v3, v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 148
    .line 149
    invoke-interface {v3, v5}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->beforeMessage(Landroid/javax/sip/message/Message;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    if-eqz v5, :cond_4

    .line 153
    .line 154
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 155
    .line 156
    iget-object v3, v3, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 157
    .line 158
    invoke-interface {v3, v5}, Landroid/gov/nist/javax/sip/parser/SIPMessageListener;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    :cond_4
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    new-instance v2, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 191
    .line 192
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 197
    .line 198
    if-eqz v0, :cond_9

    .line 199
    .line 200
    if-eqz v5, :cond_9

    .line 201
    .line 202
    :goto_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 203
    .line 204
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 209
    .line 210
    invoke-interface {p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->afterMessage(Landroid/javax/sip/message/Message;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_5

    .line 214
    .line 215
    :goto_3
    :try_start_1
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    new-instance v6, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 225
    .line 226
    iget-object v2, v2, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->message:Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-interface {v3, v2, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    .line 237
    .line 238
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_6

    .line 247
    .line 248
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    new-instance v2, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 268
    .line 269
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 274
    .line 275
    if-eqz v0, :cond_9

    .line 276
    .line 277
    if-eqz v5, :cond_9

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :goto_4
    :try_start_2
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-eqz v3, :cond_7

    .line 289
    .line 290
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    new-instance v6, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->unparsedMessage:Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;

    .line 300
    .line 301
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v1, " "

    .line 305
    .line 306
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-interface {v3, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 321
    .line 322
    .line 323
    :cond_7
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eqz v1, :cond_8

    .line 332
    .line 333
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    new-instance v2, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_8
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 353
    .line 354
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 359
    .line 360
    if-eqz v0, :cond_9

    .line 361
    .line 362
    if-eqz v5, :cond_9

    .line 363
    .line 364
    goto/16 :goto_2

    .line 365
    .line 366
    :cond_9
    :goto_5
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    if-eqz p0, :cond_a

    .line 375
    .line 376
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    new-instance v0, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    const-string v1, "dispatch task done on "

    .line 383
    .line 384
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    :cond_a
    return-void

    .line 398
    :goto_6
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    if-eqz v2, :cond_b

    .line 407
    .line 408
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    new-instance v3, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :cond_b
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 428
    .line 429
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 434
    .line 435
    if-eqz v0, :cond_c

    .line 436
    .line 437
    if-eqz v5, :cond_c

    .line 438
    .line 439
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;->this$0:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 440
    .line 441
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 446
    .line 447
    invoke-interface {p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->afterMessage(Landroid/javax/sip/message/Message;)V

    .line 448
    .line 449
    .line 450
    :cond_c
    throw v1
.end method
