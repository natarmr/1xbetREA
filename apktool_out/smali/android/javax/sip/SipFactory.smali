.class public Landroid/javax/sip/SipFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static myFactory:Landroid/javax/sip/SipFactory;


# instance fields
.field private addressFactory:Landroid/javax/sip/address/AddressFactory;

.field private headerFactory:Landroid/javax/sip/header/HeaderFactory;

.field private messageFactory:Landroid/javax/sip/message/MessageFactory;

.field private pathName:Ljava/lang/String;

.field private sipStackByName:Ljava/util/Hashtable;

.field private final sipStackList:Ljava/util/LinkedList;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "gov.nist"

    .line 5
    .line 6
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->pathName:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->messageFactory:Landroid/javax/sip/message/MessageFactory;

    .line 10
    .line 11
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    .line 12
    .line 13
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->addressFactory:Landroid/javax/sip/address/AddressFactory;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->sipStackList:Ljava/util/LinkedList;

    .line 21
    .line 22
    new-instance v0, Ljava/util/Hashtable;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->sipStackByName:Ljava/util/Hashtable;

    .line 28
    .line 29
    return-void
.end method

.method private createSipFactory(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/javax/sip/SipFactory;->getPathName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object p0

    .line 37
    :catch_0
    move-exception v1

    .line 38
    invoke-virtual {p0}, Landroid/javax/sip/SipFactory;->getPathName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "The Peer Factory: "

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, " could not be instantiated. Ensure the Path Name has been set."

    .line 59
    .line 60
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance p1, Landroid/javax/sip/PeerUnavailableException;

    .line 68
    .line 69
    invoke-direct {p1, p0, v1}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method

.method private createStack(Ljava/util/Properties;)Landroid/javax/sip/SipStack;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "java.util.Properties"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/javax/sip/SipFactory;->getPathName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, ".javax.sip.SipStackImpl"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroid/javax/sip/SipStack;

    .line 49
    .line 50
    iget-object v1, p0, Landroid/javax/sip/SipFactory;->sipStackList:Ljava/util/LinkedList;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    const-string v1, "android.javax.sip.STACK_NAME"

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, p0, Landroid/javax/sip/SipFactory;->sipStackByName:Ljava/util/Hashtable;

    .line 62
    .line 63
    invoke-virtual {v1, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :catch_0
    move-exception p1

    .line 68
    invoke-virtual {p0}, Landroid/javax/sip/SipFactory;->getPathName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, "The Peer SIP Stack: "

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p0, ".javax.sip.SipStackImpl could not be instantiated. Ensure the Path Name has been set."

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    new-instance v0, Landroid/javax/sip/PeerUnavailableException;

    .line 92
    .line 93
    invoke-direct {v0, p0, p1}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method public static declared-synchronized getInstance()Landroid/javax/sip/SipFactory;
    .locals 2

    .line 1
    const-class v0, Landroid/javax/sip/SipFactory;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroid/javax/sip/SipFactory;->myFactory:Landroid/javax/sip/SipFactory;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroid/javax/sip/SipFactory;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/javax/sip/SipFactory;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Landroid/javax/sip/SipFactory;->myFactory:Landroid/javax/sip/SipFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method


# virtual methods
.method public createAddressFactory()Landroid/javax/sip/address/AddressFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/javax/sip/SipFactory;->addressFactory:Landroid/javax/sip/address/AddressFactory;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "javax.sip.address.AddressFactoryImpl"

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroid/javax/sip/SipFactory;->createSipFactory(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/javax/sip/address/AddressFactory;

    .line 12
    .line 13
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->addressFactory:Landroid/javax/sip/address/AddressFactory;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public createHeaderFactory()Landroid/javax/sip/header/HeaderFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/javax/sip/SipFactory;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "javax.sip.header.HeaderFactoryImpl"

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroid/javax/sip/SipFactory;->createSipFactory(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/javax/sip/header/HeaderFactory;

    .line 12
    .line 13
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public createMessageFactory()Landroid/javax/sip/message/MessageFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/javax/sip/SipFactory;->messageFactory:Landroid/javax/sip/message/MessageFactory;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "javax.sip.message.MessageFactoryImpl"

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroid/javax/sip/SipFactory;->createSipFactory(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/javax/sip/message/MessageFactory;

    .line 12
    .line 13
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->messageFactory:Landroid/javax/sip/message/MessageFactory;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public declared-synchronized createSipStack(Ljava/util/Properties;)Landroid/javax/sip/SipStack;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "android.javax.sip.IP_ADDRESS"

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "android.javax.sip.STACK_NAME"

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Landroid/javax/sip/SipFactory;->sipStackByName:Ljava/util/Hashtable;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/javax/sip/SipStack;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-direct {p0, p1}, Landroid/javax/sip/SipFactory;->createStack(Ljava/util/Properties;)Landroid/javax/sip/SipStack;

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    :goto_0
    monitor-exit p0

    .line 36
    return-object v0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    :goto_1
    :try_start_1
    iget-object v2, p0, Landroid/javax/sip/SipFactory;->sipStackList:Ljava/util/LinkedList;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ge v1, v2, :cond_3

    .line 45
    .line 46
    iget-object v2, p0, Landroid/javax/sip/SipFactory;->sipStackList:Ljava/util/LinkedList;

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Landroid/javax/sip/SipStack;

    .line 53
    .line 54
    invoke-interface {v2}, Landroid/javax/sip/SipStack;->getIPAddress()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget-object p1, p0, Landroid/javax/sip/SipFactory;->sipStackList:Ljava/util/LinkedList;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Landroid/javax/sip/SipStack;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    monitor-exit p0

    .line 73
    return-object p1

    .line 74
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    :try_start_2
    invoke-direct {p0, p1}, Landroid/javax/sip/SipFactory;->createStack(Ljava/util/Properties;)Landroid/javax/sip/SipStack;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    monitor-exit p0

    .line 82
    return-object p1

    .line 83
    :cond_4
    :try_start_3
    new-instance p1, Landroid/javax/sip/PeerUnavailableException;

    .line 84
    .line 85
    const-string v0, "Missing android.javax.sip.STACK_NAME property"

    .line 86
    .line 87
    invoke-direct {p1, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :goto_2
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    throw p1
.end method

.method public getPathName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/SipFactory;->pathName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public resetFactory()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/javax/sip/SipFactory;->sipStackList:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->messageFactory:Landroid/javax/sip/message/MessageFactory;

    .line 8
    .line 9
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    .line 10
    .line 11
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->addressFactory:Landroid/javax/sip/address/AddressFactory;

    .line 12
    .line 13
    new-instance v0, Ljava/util/Hashtable;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->sipStackByName:Ljava/util/Hashtable;

    .line 19
    .line 20
    const-string v0, "gov.nist"

    .line 21
    .line 22
    iput-object v0, p0, Landroid/javax/sip/SipFactory;->pathName:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public setPathName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/javax/sip/SipFactory;->pathName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
