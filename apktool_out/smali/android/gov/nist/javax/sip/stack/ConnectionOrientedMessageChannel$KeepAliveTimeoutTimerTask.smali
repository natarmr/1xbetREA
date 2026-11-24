.class Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "KeepAliveTimeoutTimerTask"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public runTask()V
    .locals 14

    .line 1
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "~~~ Starting processing of KeepAliveTimeoutEvent( "

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 25
    .line 26
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ","

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 41
    .line 42
    iget v2, v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, ")..."

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {v0, v1, v1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->close(ZZ)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 66
    .line 67
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 68
    .line 69
    instance-of v1, v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->getSipProviders()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v3, v1

    .line 90
    check-cast v3, Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 91
    .line 92
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoints()[Landroid/javax/sip/ListeningPoint;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    array-length v11, v10

    .line 101
    const/4 v2, 0x0

    .line 102
    move v12, v2

    .line 103
    :goto_0
    if-ge v12, v11, :cond_1

    .line 104
    .line 105
    aget-object v2, v10, v12

    .line 106
    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    instance-of v4, v1, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 110
    .line 111
    if-eqz v4, :cond_2

    .line 112
    .line 113
    invoke-interface {v2}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 118
    .line 119
    iget-object v5, v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myAddress:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_2

    .line 126
    .line 127
    invoke-interface {v2}, Landroid/javax/sip/ListeningPoint;->getPort()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 132
    .line 133
    iget v5, v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myPort:I

    .line 134
    .line 135
    if-ne v4, v5, :cond_2

    .line 136
    .line 137
    invoke-interface {v2}, Landroid/javax/sip/ListeningPoint;->getTransport()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_2

    .line 152
    .line 153
    move-object v13, v1

    .line 154
    check-cast v13, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 155
    .line 156
    new-instance v2, Landroid/gov/nist/javax/sip/IOExceptionEventExt;

    .line 157
    .line 158
    sget-object v4, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;->KeepAliveTimeout:Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 159
    .line 160
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 161
    .line 162
    move-object v6, v5

    .line 163
    iget-object v5, v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myAddress:Ljava/lang/String;

    .line 164
    .line 165
    move-object v7, v6

    .line 166
    iget v6, v7, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myPort:I

    .line 167
    .line 168
    iget-object v7, v7, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    iget-object v8, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 175
    .line 176
    move-object v9, v8

    .line 177
    iget v8, v9, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 178
    .line 179
    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    invoke-direct/range {v2 .. v9}, Landroid/gov/nist/javax/sip/IOExceptionEventExt;-><init>(Ljava/lang/Object;Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v13, v2}, Landroid/javax/sip/SipListener;->processIOException(Landroid/javax/sip/IOExceptionEvent;)V

    .line 187
    .line 188
    .line 189
    :cond_2
    add-int/lit8 v12, v12, 0x1

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSipListener()Landroid/javax/sip/SipListener;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    instance-of v1, v0, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 197
    .line 198
    if-eqz v1, :cond_4

    .line 199
    .line 200
    check-cast v0, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 201
    .line 202
    new-instance v1, Landroid/gov/nist/javax/sip/IOExceptionEventExt;

    .line 203
    .line 204
    sget-object v3, Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;->KeepAliveTimeout:Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;

    .line 205
    .line 206
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 207
    .line 208
    iget-object v4, v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myAddress:Ljava/lang/String;

    .line 209
    .line 210
    iget v5, v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myPort:I

    .line 211
    .line 212
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 219
    .line 220
    iget v7, v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 221
    .line 222
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    move-object v2, p0

    .line 227
    invoke-direct/range {v1 .. v8}, Landroid/gov/nist/javax/sip/IOExceptionEventExt;-><init>(Ljava/lang/Object;Landroid/gov/nist/javax/sip/IOExceptionEventExt$Reason;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v0, v1}, Landroid/javax/sip/SipListener;->processIOException(Landroid/javax/sip/IOExceptionEvent;)V

    .line 231
    .line 232
    .line 233
    :cond_4
    return-void
.end method
