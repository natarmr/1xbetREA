.class public Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ReInviteSender"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xe2571ebeadfbf2bL


# instance fields
.field ctx:Landroid/javax/sip/ClientTransaction;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/javax/sip/ClientTransaction;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 7
    .line 8
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/16 p1, 0x20

    .line 13
    .line 14
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v0, "ReInviteSender::ReInviteSender: ctx = "

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    const-string v0, "SIPDialog::reInviteSender: dialog = "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    const/16 v5, 0x20

    .line 13
    .line 14
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    new-instance v6, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 30
    .line 31
    invoke-interface {v0}, Landroid/javax/sip/Transaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, " lastTransaction = "

    .line 39
    .line 40
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 44
    .line 45
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 46
    .line 47
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, " lastTransactionState "

    .line 51
    .line 52
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 56
    .line 57
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 58
    .line 59
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v4, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :catch_0
    move-exception v0

    .line 78
    goto/16 :goto_4

    .line 79
    .line 80
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 81
    .line 82
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    instance-of v4, v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 87
    .line 88
    if-eqz v4, :cond_1

    .line 89
    .line 90
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 97
    .line 98
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 99
    .line 100
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v4, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 105
    .line 106
    if-eq v0, v4, :cond_1

    .line 107
    .line 108
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 109
    .line 110
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 111
    .line 112
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 113
    .line 114
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->waitForTermination()V

    .line 115
    .line 116
    .line 117
    const-wide/16 v6, 0x32

    .line 118
    .line 119
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->takeAckSem()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    const/4 v4, 0x1

    .line 129
    if-nez v0, :cond_5

    .line 130
    .line 131
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const-string v6, "Could not send re-INVITE time out ClientTransaction"

    .line 146
    .line 147
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 151
    .line 152
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 153
    .line 154
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->fireTimeoutTimer()V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 158
    .line 159
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$200(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-eqz v0, :cond_3

    .line 168
    .line 169
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 170
    .line 171
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$200(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    instance-of v0, v0, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 180
    .line 181
    if-eqz v0, :cond_3

    .line 182
    .line 183
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 184
    .line 185
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 186
    .line 187
    check-cast v6, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 188
    .line 189
    const/4 v7, 0x3

    .line 190
    invoke-static {v0, v7, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$400(Landroid/gov/nist/javax/sip/stack/SIPDialog;ILandroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    .line 191
    .line 192
    .line 193
    move v0, v4

    .line 194
    goto :goto_1

    .line 195
    :cond_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 196
    .line 197
    const-string v2, "BYE"

    .line 198
    .line 199
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->createRequest(Ljava/lang/String;)Landroid/javax/sip/message/Request;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    if-eqz v2, :cond_4

    .line 208
    .line 209
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-interface {v0, v2}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 214
    .line 215
    .line 216
    :cond_4
    new-instance v2, Landroid/gov/nist/javax/sip/header/Reason;

    .line 217
    .line 218
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/Reason;-><init>()V

    .line 219
    .line 220
    .line 221
    const/16 v3, 0x400

    .line 222
    .line 223
    invoke-interface {v2, v3}, Landroid/javax/sip/header/ReasonHeader;->setCause(I)V

    .line 224
    .line 225
    .line 226
    const-string v3, "Timed out waiting to re-INVITE"

    .line 227
    .line 228
    invoke-interface {v2, v3}, Landroid/javax/sip/header/ReasonHeader;->setText(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v0, v2}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 232
    .line 233
    .line 234
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 235
    .line 236
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 245
    .line 246
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sendRequest(Landroid/javax/sip/ClientTransaction;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    .line 248
    .line 249
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 250
    .line 251
    return-void

    .line 252
    :cond_5
    const/4 v0, 0x0

    .line 253
    :goto_1
    :try_start_1
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 254
    .line 255
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    sget-object v7, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 260
    .line 261
    const-wide/16 v8, 0x0

    .line 262
    .line 263
    if-eq v6, v7, :cond_6

    .line 264
    .line 265
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 266
    .line 267
    .line 268
    move-result-wide v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    sub-long/2addr v10, v2

    .line 270
    goto :goto_2

    .line 271
    :cond_6
    move-wide v10, v8

    .line 272
    :goto_2
    cmp-long v2, v10, v8

    .line 273
    .line 274
    if-eqz v2, :cond_8

    .line 275
    .line 276
    :try_start_2
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 277
    .line 278
    iget v2, v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->reInviteWaitTime:I

    .line 279
    .line 280
    int-to-long v2, v2

    .line 281
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :catch_1
    :try_start_3
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_7

    .line 294
    .line 295
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const-string v2, "Interrupted sleep"

    .line 300
    .line 301
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 302
    .line 303
    .line 304
    :cond_7
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 305
    .line 306
    return-void

    .line 307
    :cond_8
    :goto_3
    :try_start_4
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 308
    .line 309
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    if-eq v2, v7, :cond_9

    .line 314
    .line 315
    if-nez v0, :cond_9

    .line 316
    .line 317
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 318
    .line 319
    invoke-interface {v0}, Landroid/javax/sip/Transaction;->getState()Landroid/javax/sip/TransactionState;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    sget-object v2, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 324
    .line 325
    if-eq v0, v2, :cond_9

    .line 326
    .line 327
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 328
    .line 329
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 330
    .line 331
    invoke-virtual {v0, v2, v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sendRequest(Landroid/javax/sip/ClientTransaction;Z)V

    .line 332
    .line 333
    .line 334
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_9

    .line 343
    .line 344
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    const-string v2, "re-INVITE successfully sent"

    .line 349
    .line 350
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 351
    .line 352
    .line 353
    :cond_9
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 354
    .line 355
    return-void

    .line 356
    :goto_4
    :try_start_5
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const-string v3, "Error sending re-INVITE"

    .line 361
    .line 362
    invoke-interface {v2, v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 363
    .line 364
    .line 365
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 366
    .line 367
    return-void

    .line 368
    :goto_5
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 369
    .line 370
    throw v0
.end method

.method public terminate()V
    .locals 3

    .line 1
    const-string v0, "ReInviteSender::terminate: ctx = "

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;->ctx:Landroid/javax/sip/ClientTransaction;

    .line 37
    .line 38
    invoke-interface {p0}, Landroid/javax/sip/Transaction;->terminate()V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V
    :try_end_0
    .catch Landroid/javax/sip/ObjectInUseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "unexpected error"

    .line 55
    .line 56
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
