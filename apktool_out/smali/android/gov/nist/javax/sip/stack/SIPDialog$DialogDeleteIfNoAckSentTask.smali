.class Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DialogDeleteIfNoAckSentTask"
.end annotation


# instance fields
.field private seqno:J

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->seqno:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public runTask()V
    .locals 5

    .line 1
    const-string v0, "Timed out waiting to send ACK "

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 4
    .line 5
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$800(Landroid/gov/nist/javax/sip/stack/SIPDialog;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-wide v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->seqno:J

    .line 10
    .line 11
    cmp-long v1, v1, v3

    .line 12
    .line 13
    if-gez v1, :cond_6

    .line 14
    .line 15
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$902(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;)Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 22
    .line 23
    iget-boolean v1, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "ACK Was not sent. killing dialog "

    .line 45
    .line 46
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 50
    .line 51
    iget-object v3, v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 64
    .line 65
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$200(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    instance-of v0, v0, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 74
    .line 75
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    invoke-static {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$300(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "ACK Was not sent. Sending BYE "

    .line 104
    .line 105
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 109
    .line 110
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 123
    .line 124
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$200(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    instance-of v1, v1, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 133
    .line 134
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 135
    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    invoke-static {v3, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$300(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_4
    :try_start_0
    const-string v1, "BYE"

    .line 143
    .line 144
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->createRequest(Ljava/lang/String;)Landroid/javax/sip/message/Request;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v1, v2}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 159
    .line 160
    .line 161
    :cond_5
    new-instance v2, Landroid/gov/nist/javax/sip/header/Reason;

    .line 162
    .line 163
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/Reason;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v3, "SIP"

    .line 167
    .line 168
    invoke-interface {v2, v3}, Landroid/javax/sip/header/ReasonHeader;->setProtocol(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const/16 v3, 0x401

    .line 172
    .line 173
    invoke-interface {v2, v3}, Landroid/javax/sip/header/ReasonHeader;->setCause(I)V

    .line 174
    .line 175
    .line 176
    new-instance v3, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 182
    .line 183
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v2, v0}, Landroid/javax/sip/header/ReasonHeader;->setText(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v1, v2}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 209
    .line 210
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sendRequest(Landroid/javax/sip/ClientTransaction;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :catch_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 215
    .line 216
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 217
    .line 218
    .line 219
    :cond_6
    return-void
.end method
