.class public Landroid/gov/nist/javax/sip/stack/OIOMessageProcessorFactory;
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
    .locals 2

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
    new-instance p0, Landroid/gov/nist/javax/sip/stack/TCPMessageProcessor;

    .line 29
    .line 30
    invoke-direct {p0, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/TCPMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

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
    new-instance p0, Landroid/gov/nist/javax/sip/stack/TLSMessageProcessor;

    .line 43
    .line 44
    invoke-direct {p0, p2, p1, p3}, Landroid/gov/nist/javax/sip/stack/TLSMessageProcessor;-><init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V

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
    move-result p4

    .line 54
    const/4 v0, 0x0

    .line 55
    if-eqz p4, :cond_3

    .line 56
    .line 57
    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    const-string v1, "android.gov.nist.javax.sip.stack.sctp.SCTPMessageProcessor"

    .line 62
    .line 63
    invoke-virtual {p4, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

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
    return-object v0

    .line 85
    :goto_1
    invoke-static {p0, p1}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :catch_2
    const-string p0, "SCTP not supported (needs Java 7 and SCTP jar in classpath)"

    .line 90
    .line 91
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_3
    const-string p0, "bad transport"

    .line 96
    .line 97
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v0
.end method
