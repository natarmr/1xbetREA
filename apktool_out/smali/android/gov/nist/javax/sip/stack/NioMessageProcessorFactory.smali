.class public Landroid/gov/nist/javax/sip/stack/NioMessageProcessorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createMessageProcessor(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Ljava/net/InetAddress;ILjava/lang/String;)Landroid/gov/nist/javax/sip/stack/MessageProcessor;
    .locals 4

    .line 1
    const-string p0, "Error initializing SCTP"

    .line 2
    .line 3
    const-string v0, "UDP"

    .line 4
    .line 5
    invoke-virtual {p4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;

    .line 12
    .line 13
    invoke-direct {p0, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->udpFlag:Z

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string v0, "TCP"

    .line 21
    .line 22
    invoke-virtual {p4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 29
    .line 30
    invoke-direct {p0, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    const-string v0, "TLS"

    .line 35
    .line 36
    invoke-virtual {p4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    new-instance p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageProcessor;

    .line 43
    .line 44
    invoke-direct {p0, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    const-string v0, "SCTP"

    .line 49
    .line 50
    invoke-virtual {p4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    const-string v0, "android.gov.nist.javax.sip.stack.sctp.SCTPMessageProcessor"

    .line 62
    .line 63
    invoke-virtual {p4, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    invoke-virtual {p4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    check-cast p4, Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 72
    .line 73
    invoke-virtual {p4, p2, p3, p1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->initialize(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    return-object p4

    .line 77
    :catch_0
    move-exception p1

    .line 78
    goto :goto_0

    .line 79
    :catch_1
    move-exception p1

    .line 80
    goto :goto_1

    .line 81
    :goto_0
    invoke-static {p0, p1}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :goto_1
    invoke-static {p0, p1}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :catch_2
    const-string p0, "SCTP not supported (needs Java 7 and SCTP jar in classpath)"

    .line 90
    .line 91
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_3
    const-string p0, "WS"

    .line 96
    .line 97
    invoke-virtual {p4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    const-string v2, "android.gov.nist.javax.sip.USE_TLS_GATEWAY"

    .line 102
    .line 103
    const-string v3, "true"

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    move-object p4, p1

    .line 108
    check-cast p4, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 109
    .line 110
    invoke-virtual {p4}, Landroid/gov/nist/javax/sip/SipStackImpl;->getConfigurationProperties()Ljava/util/Properties;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    invoke-virtual {p4, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p4

    .line 118
    invoke-virtual {v3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p4

    .line 122
    if-eqz p4, :cond_4

    .line 123
    .line 124
    new-instance p4, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageProcessor;

    .line 125
    .line 126
    invoke-direct {p4, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

    .line 127
    .line 128
    .line 129
    iput-object p0, p4, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    .line 130
    .line 131
    return-object p4

    .line 132
    :cond_4
    new-instance p4, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageProcessor;

    .line 133
    .line 134
    invoke-direct {p4, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

    .line 135
    .line 136
    .line 137
    iput-object p0, p4, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    .line 138
    .line 139
    return-object p4

    .line 140
    :cond_5
    const-string p0, "WSS"

    .line 141
    .line 142
    invoke-virtual {p4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result p4

    .line 146
    if-eqz p4, :cond_7

    .line 147
    .line 148
    move-object p4, p1

    .line 149
    check-cast p4, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 150
    .line 151
    invoke-virtual {p4}, Landroid/gov/nist/javax/sip/SipStackImpl;->getConfigurationProperties()Ljava/util/Properties;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    invoke-virtual {p4, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p4

    .line 159
    invoke-virtual {v3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p4

    .line 163
    if-eqz p4, :cond_6

    .line 164
    .line 165
    new-instance p4, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageProcessor;

    .line 166
    .line 167
    invoke-direct {p4, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

    .line 168
    .line 169
    .line 170
    iput-object p0, p4, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    .line 171
    .line 172
    return-object p4

    .line 173
    :cond_6
    new-instance p4, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageProcessor;

    .line 174
    .line 175
    invoke-direct {p4, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

    .line 176
    .line 177
    .line 178
    iput-object p0, p4, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    .line 179
    .line 180
    return-object p4

    .line 181
    :cond_7
    const-string p0, "bad transport"

    .line 182
    .line 183
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object v1
.end method
