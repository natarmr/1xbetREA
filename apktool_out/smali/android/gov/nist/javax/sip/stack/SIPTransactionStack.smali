.class public abstract Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SIPTransactionEventListener;
.implements Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$RemoveForkedTransactionTimerTask;,
        Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;
    }
.end annotation


# static fields
.field public static final BASE_TIMER_INTERVAL:I = 0x1f4

.field private static connectionLingerTimer:I

.field protected static final dialogCreatingMethods:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static logger:Landroid/gov/nist/core/StackLogger;

.field protected static selfRoutingThreadpoolExecutor:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field private activeClientTransactionCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field protected addressResolver:Landroid/gov/nist/core/net/AddressResolver;

.field protected cacheClientConnections:Z

.field protected cacheServerConnections:Z

.field protected cancelClientTransactionChecked:Z

.field protected checkBranchId:Z

.field protected clientAuth:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

.field protected clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;",
            ">;"
        }
    .end annotation
.end field

.field protected clientTransactionTableHiwaterMark:I

.field protected clientTransactionTableLowaterMark:I

.field protected connTimeout:I

.field protected defaultRouter:Landroid/gov/nist/javax/sip/stack/DefaultRouter;

.field protected deliverRetransmittedAckToListener:Z

.field private deliverTerminatedEventForAck:Z

.field private deliverUnsolicitedNotify:Z

.field protected dialogTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPDialog;",
            ">;"
        }
    .end annotation
.end field

.field protected dialogTimeoutFactor:I

.field protected earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPDialog;",
            ">;"
        }
    .end annotation
.end field

.field protected earlyDialogTimeout:I

.field private forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;",
            ">;"
        }
    .end annotation
.end field

.field protected forkedEvents:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected generateTimeStampHeader:Z

.field protected ioHandler:Landroid/gov/nist/javax/sip/stack/IOHandler;

.field protected isAutomaticDialogErrorHandlingEnabled:Z

.field protected isAutomaticDialogSupportEnabled:Z

.field protected isBackToBackUserAgent:Z

.field protected isDialogTerminatedEventDeliveredForNullDialog:Z

.field protected logRecordFactory:Landroid/gov/nist/javax/sip/LogRecordFactory;

.field protected logStackTraceOnMessageSend:Z

.field protected maxConnections:I

.field protected maxContentLength:I

.field protected maxForkTime:I

.field protected maxListenerResponseTime:I

.field protected maxMessageSize:I

.field protected maxTxLifetimeInvite:I

.field protected maxTxLifetimeNonInvite:I

.field private mergeTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;",
            ">;"
        }
    .end annotation
.end field

.field public messageParserFactory:Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

.field public messageProcessorFactory:Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;

.field private messageProcessors:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Landroid/gov/nist/javax/sip/stack/MessageProcessor;",
            ">;"
        }
    .end annotation
.end field

.field protected minKeepAliveInterval:J

.field protected needsLogging:Z

.field protected networkLayer:Landroid/gov/nist/core/net/NetworkLayer;

.field public nioMode:Landroid/gov/nist/javax/sip/stack/NIOMode;

.field public nioSocketMaxIdleTime:J

.field private non2XXAckPassedToListener:Z

.field protected outboundProxy:Ljava/lang/String;

.field protected patchReceivedRport:Z

.field protected patchRport:Z

.field protected patchWebSocketHeaders:Z

.field private pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;",
            ">;"
        }
    .end annotation
.end field

.field protected readTimeout:I

.field protected receiveUdpBufferSize:I

.field private reinviteExecutor:Ljava/util/concurrent/ExecutorService;

.field private releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

.field protected reliableConnectionKeepAliveTimeout:I

.field protected remoteTagReassignmentAllowed:Z

.field protected retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;",
            ">;"
        }
    .end annotation
.end field

.field protected rfc2543Supported:Z

.field protected router:Landroid/javax/sip/address/Router;

.field protected routerPath:Ljava/lang/String;

.field protected securityManagerProvider:Landroid/gov/nist/core/net/SecurityManagerProvider;

.field protected sendUdpBufferSize:I

.field protected serverDialogMergeTestTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPDialog;",
            ">;"
        }
    .end annotation
.end field

.field protected serverLogger:Landroid/gov/nist/core/ServerLogger;

.field protected serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;",
            ">;"
        }
    .end annotation
.end field

.field protected serverTransactionTableHighwaterMark:I

.field protected serverTransactionTableLowaterMark:I

.field public sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

.field protected sipMessageFactory:Landroid/gov/nist/javax/sip/stack/StackMessageFactory;

.field public sipMessageValves:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/gov/nist/javax/sip/stack/SIPMessageValve;",
            ">;"
        }
    .end annotation
.end field

.field private sslHandshakeTimeout:J

.field private sslRenegotiationEnabled:Z

.field protected stackAddress:Ljava/lang/String;

.field private stackCongestionControlTimeout:I

.field protected stackInetAddress:Ljava/net/InetAddress;

.field protected stackName:Ljava/lang/String;

.field private tcpPostParsingThreadPoolSize:I

.field private terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;",
            ">;"
        }
    .end annotation
.end field

.field protected threadAuditor:Landroid/gov/nist/core/ThreadAuditor;

.field protected threadPoolSize:I

.field private threadPriority:I

.field private timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

.field protected toExit:Z

.field udpFlag:Z

.field protected unlimitedClientTransactionTableSize:Z

.field protected unlimitedServerTransactionTableSize:Z

.field protected useRouterForAll:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->connectionLingerTimer:I

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogCreatingMethods:Ljava/util/Set;

    .line 19
    .line 20
    const-string v1, "REFER"

    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const-string v1, "INVITE"

    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    const-string v1, "SUBSCRIBE"

    .line 31
    .line 32
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xb4

    .line 5
    .line 6
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTimeout:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->unlimitedServerTransactionTableSize:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->unlimitedClientTransactionTableSize:Z

    .line 12
    .line 13
    const/16 v1, 0x1388

    .line 14
    .line 15
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTableHighwaterMark:I

    .line 16
    .line 17
    const/16 v1, 0xfa0

    .line 18
    .line 19
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTableLowaterMark:I

    .line 20
    .line 21
    const/16 v1, 0x3e8

    .line 22
    .line 23
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTableHiwaterMark:I

    .line 24
    .line 25
    const/16 v1, 0x320

    .line 26
    .line 27
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTableLowaterMark:I

    .line 28
    .line 29
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->activeClientTransactionCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 36
    .line 37
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverRetransmittedAckToListener:Z

    .line 38
    .line 39
    const/16 v1, 0x2710

    .line 40
    .line 41
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->connTimeout:I

    .line 42
    .line 43
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->rfc2543Supported:Z

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadAuditor:Landroid/gov/nist/core/ThreadAuditor;

    .line 47
    .line 48
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cancelClientTransactionChecked:Z

    .line 49
    .line 50
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->remoteTagReassignmentAllowed:Z

    .line 51
    .line 52
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logStackTraceOnMessageSend:Z

    .line 53
    .line 54
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackCongestionControlTimeout:I

    .line 55
    .line 56
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isBackToBackUserAgent:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogErrorHandlingEnabled:Z

    .line 59
    .line 60
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogTerminatedEventDeliveredForNullDialog:Z

    .line 61
    .line 62
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxForkTime:I

    .line 63
    .line 64
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverUnsolicitedNotify:Z

    .line 65
    .line 66
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverTerminatedEventForAck:Z

    .line 67
    .line 68
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchWebSocketHeaders:Z

    .line 69
    .line 70
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchRport:Z

    .line 71
    .line 72
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchReceivedRport:Z

    .line 73
    .line 74
    sget-object v1, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->Default:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 75
    .line 76
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientAuth:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 77
    .line 78
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->tcpPostParsingThreadPoolSize:I

    .line 79
    .line 80
    const-wide/16 v3, -0x1

    .line 81
    .line 82
    iput-wide v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->minKeepAliveInterval:J

    .line 83
    .line 84
    const/16 v1, 0x40

    .line 85
    .line 86
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTimeoutFactor:I

    .line 87
    .line 88
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOMode;->BLOCKING:Landroid/gov/nist/javax/sip/stack/NIOMode;

    .line 89
    .line 90
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->nioMode:Landroid/gov/nist/javax/sip/stack/NIOMode;

    .line 91
    .line 92
    sget-object v1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 93
    .line 94
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 95
    .line 96
    const/16 v1, 0xa

    .line 97
    .line 98
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPriority:I

    .line 99
    .line 100
    const/4 v1, -0x1

    .line 101
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->reliableConnectionKeepAliveTimeout:I

    .line 102
    .line 103
    iput-wide v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sslHandshakeTimeout:J

    .line 104
    .line 105
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sslRenegotiationEnabled:Z

    .line 106
    .line 107
    new-instance v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$1;

    .line 108
    .line 109
    invoke-direct {v3, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$1;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iput-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->reinviteExecutor:Ljava/util/concurrent/ExecutorService;

    .line 117
    .line 118
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->toExit:Z

    .line 119
    .line 120
    new-instance v2, Ljava/util/HashSet;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedEvents:Ljava/util/HashSet;

    .line 126
    .line 127
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 128
    .line 129
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheServerConnections:Z

    .line 130
    .line 131
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheClientConnections:Z

    .line 132
    .line 133
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxConnections:I

    .line 134
    .line 135
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 141
    .line 142
    new-instance v0, Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 143
    .line 144
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/IOHandler;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->ioHandler:Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 148
    .line 149
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->readTimeout:I

    .line 150
    .line 151
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxListenerResponseTime:I

    .line 152
    .line 153
    new-instance v0, Landroid/gov/nist/javax/sip/DefaultAddressResolver;

    .line 154
    .line 155
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/DefaultAddressResolver;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addressResolver:Landroid/gov/nist/core/net/AddressResolver;

    .line 159
    .line 160
    new-instance v0, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 166
    .line 167
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 168
    .line 169
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 173
    .line 174
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 175
    .line 176
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 177
    .line 178
    .line 179
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 180
    .line 181
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 182
    .line 183
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 184
    .line 185
    .line 186
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverDialogMergeTestTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 187
    .line 188
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 191
    .line 192
    .line 193
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 194
    .line 195
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 201
    .line 202
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 203
    .line 204
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 205
    .line 206
    .line 207
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 208
    .line 209
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 212
    .line 213
    .line 214
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mergeTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 215
    .line 216
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 217
    .line 218
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 222
    .line 223
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 224
    .line 225
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 229
    .line 230
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 236
    .line 237
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/StackMessageFactory;)V
    .locals 0

    .line 238
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;-><init>()V

    .line 239
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageFactory:Landroid/gov/nist/javax/sip/stack/StackMessageFactory;

    return-void
.end method

.method public static synthetic access$000()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method private addTransactionHash(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 6
    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->unlimitedClientTransactionTableSize:Z

    .line 12
    .line 13
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->activeClientTransactionCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTableHiwaterMark:I

    .line 22
    .line 23
    if-le v1, v3, :cond_1

    .line 24
    .line 25
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    :try_start_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->wait()V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->activeClientTransactionCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 36
    .line 37
    .line 38
    monitor-exit v1

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v3

    .line 41
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :try_start_2
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 43
    :catch_0
    move-exception v1

    .line 44
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    invoke-interface {v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 53
    .line 54
    const-string v4, "Exception occured while waiting for room"

    .line 55
    .line 56
    invoke-interface {v3, v4, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    move-object v1, p1

    .line 70
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 71
    .line 72
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 77
    .line 78
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 79
    .line 80
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 87
    .line 88
    const-string v2, " putTransactionHash :  key = "

    .line 89
    .line 90
    invoke-static {v2, v0, v1}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 99
    .line 100
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 107
    .line 108
    const-string v2, " putTransactionHash :  key = "

    .line 109
    .line 110
    invoke-static {v2, v0, v1}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 114
    .line 115
    move-object v1, p1

    .line 116
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 117
    .line 118
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 123
    .line 124
    :cond_4
    :goto_1
    if-nez p0, :cond_5

    .line 125
    .line 126
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->scheduleMaxTxLifeTimeTimer()V

    .line 127
    .line 128
    .line 129
    :cond_5
    return-void
.end method

.method private auditDialogs(Ljava/util/Set;J)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "  Leaked dialogs:\n"

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    new-instance v4, Ljava/util/LinkedList;

    .line 11
    .line 12
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v4, p0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v3, 0x0

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, 0x0

    .line 32
    if-eqz v4, :cond_5

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v6, v5

    .line 48
    :goto_1
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-interface {v6}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    :cond_2
    if-eqz v4, :cond_0

    .line 55
    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_0

    .line 63
    .line 64
    iget-wide v5, v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->auditTag:J

    .line 65
    .line 66
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    cmp-long v7, v5, v7

    .line 69
    .line 70
    if-nez v7, :cond_3

    .line 71
    .line 72
    iput-wide v1, v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->auditTag:J

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    sub-long v5, v1, v5

    .line 76
    .line 77
    cmp-long v5, v5, p2

    .line 78
    .line 79
    if-ltz v5, :cond_0

    .line 80
    .line 81
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    new-instance v6, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v7, "dialog id: "

    .line 90
    .line 91
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v7, ", dialog state: "

    .line 102
    .line 103
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    if-eqz v5, :cond_4

    .line 107
    .line 108
    invoke-virtual {v5}, Landroid/javax/sip/DialogState;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    goto :goto_2

    .line 113
    :cond_4
    const-string v5, "null"

    .line 114
    .line 115
    :goto_2
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    const-string v6, "    "

    .line 123
    .line 124
    const-string v7, "\n"

    .line 125
    .line 126
    invoke-static {v0, v6, v5, v7}, La/kng0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const/4 v6, 0x3

    .line 131
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 132
    .line 133
    .line 134
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 135
    .line 136
    const/16 v6, 0x20

    .line 137
    .line 138
    invoke-interface {v4, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_0

    .line 143
    .line 144
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 145
    .line 146
    const-string v6, "auditDialogs: leaked "

    .line 147
    .line 148
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_5
    if-lez v3, :cond_6

    .line 158
    .line 159
    new-instance p0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p1, "    Total: "

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string p1, " leaked dialogs detected and removed.\n"

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :cond_6
    return-object v5

    .line 190
    :catchall_0
    move-exception p0

    .line 191
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    throw p0
.end method

.method private auditTransactions(Ljava/util/concurrent/ConcurrentHashMap;J)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Ljava/util/LinkedList;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v2, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v2, "  Leaked transactions:\n"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v4, :cond_5

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getAuditTag()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    const-wide/16 v8, 0x0

    .line 41
    .line 42
    cmp-long v6, v6, v8

    .line 43
    .line 44
    if-nez v6, :cond_1

    .line 45
    .line 46
    invoke-interface {v4, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setAuditTag(J)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getAuditTag()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    sub-long v6, v0, v6

    .line 55
    .line 56
    cmp-long v6, v6, p2

    .line 57
    .line 58
    if-ltz v6, :cond_0

    .line 59
    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v8, ", state: "

    .line 90
    .line 91
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v8, "null"

    .line 95
    .line 96
    if-eqz v6, :cond_3

    .line 97
    .line 98
    invoke-virtual {v6}, Landroid/javax/sip/TransactionState;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    move-object v6, v8

    .line 104
    :goto_1
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v6, ", OR: "

    .line 108
    .line 109
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    if-eqz v5, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move-object v5, v8

    .line 116
    :goto_2
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const-string v6, "    "

    .line 124
    .line 125
    const-string v7, "\n"

    .line 126
    .line 127
    invoke-static {v2, v6, v5, v7}, La/kng0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 132
    .line 133
    .line 134
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 135
    .line 136
    const/16 v6, 0x20

    .line 137
    .line 138
    invoke-interface {v4, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_0

    .line 143
    .line 144
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 145
    .line 146
    const-string v6, "auditTransactions: leaked "

    .line 147
    .line 148
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_5
    if-lez v3, :cond_6

    .line 158
    .line 159
    new-instance p0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p1, "    Total: "

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string p1, " leaked transactions detected and removed.\n"

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :cond_6
    return-object v5
.end method

.method private findMessageProcessor(Ljava/lang/String;ILjava/lang/String;)Landroid/gov/nist/javax/sip/stack/MessageProcessor;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageProcessors()[Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getSavedIpAddress()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ne v3, p2, :cond_0

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static isDialogCreated(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogCreatingMethods:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method


# virtual methods
.method public addExtensionMethod(Ljava/lang/String;)V
    .locals 0

    .line 1
    const-string p0, "NOTIFY"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    const/16 p1, 0x20

    .line 12
    .line 13
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    const-string p1, "NOTIFY Supported Natively"

    .line 22
    .line 23
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogCreatingMethods:Ljava/util/Set;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Landroid/gov/nist/javax/sip/Utils;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public addForkedClientTransaction(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setForkId(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 25
    .line 26
    invoke-interface {v1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 27
    .line 28
    .line 29
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v3, "Adding forked client transaction : "

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, " branch="

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBranch()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v3, " forkId = "

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v3, "  sipDialog = "

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v3, " sipDialogId= "

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 97
    .line 98
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public addMessageProcessor(Landroid/gov/nist/javax/sip/stack/MessageProcessor;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addTransaction(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V
    .locals 3

    .line 37
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "added transaction "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 39
    :cond_0
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionHash(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-void
.end method

.method public addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "added transaction "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->map()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionHash(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public addTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public auditStack(Ljava/util/Set;JJ)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->auditDialogs(Ljava/util/Set;J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-direct {p0, p2, p4, p5}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->auditTransactions(Ljava/util/concurrent/ConcurrentHashMap;J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {p0, p3, p4, p5}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->auditTransactions(Ljava/util/concurrent/ConcurrentHashMap;J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string p4, "SIP Stack Audit:\n"

    .line 29
    .line 30
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string p4, ""

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object p1, p4

    .line 39
    :goto_1
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move-object p2, p4

    .line 46
    :goto_2
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    if-eqz p0, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move-object p0, p4

    .line 53
    :goto_3
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public checkBranchId()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->checkBranchId:Z

    .line 2
    .line 3
    return p0
.end method

.method public closeAllSockets()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->ioHandler:Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/IOHandler;->closeAll()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 23
    .line 24
    instance-of v1, v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 29
    .line 30
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->closeAll()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public closeReliableConnection(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findMessageProcessor(Ljava/lang/String;ILjava/lang/String;)Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    instance-of v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    const-string v1, ", myPort="

    .line 24
    .line 25
    const-string v2, ", transport="

    .line 26
    .line 27
    const-string v3, "~~~ closeReliableConnection( myAddress="

    .line 28
    .line 29
    invoke-static {p2, v3, p1, v1, v2}, La/kng0;->p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p2, ", peerAddress="

    .line 34
    .line 35
    const-string v1, ", peerPort="

    .line 36
    .line 37
    invoke-static {p1, p3, p2, p4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p2, "), MessageProcessor="

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    check-cast p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 59
    .line 60
    invoke-virtual {p0, p4, p5}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->closeReliableConnection(Ljava/lang/String;I)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :cond_1
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public createClientTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public createDialog(Landroid/gov/nist/javax/sip/SipProviderImpl;Landroid/gov/nist/javax/sip/message/SIPResponse;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 0

    .line 231
    new-instance p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/SipProviderImpl;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    return-object p0
.end method

.method public createDialog(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 6

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p2, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 17
    .line 18
    const/16 v3, 0x20

    .line 19
    .line 20
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    const-string v4, "createDialog originalDialogId="

    .line 29
    .line 30
    invoke-static {v4, v0, v2}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 31
    .line 32
    .line 33
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 34
    .line 35
    const-string v4, "createDialog earlyDialogId="

    .line 36
    .line 37
    invoke-static {v4, v1, v2}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 41
    .line 42
    new-instance v4, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v5, "createDialog default Dialog="

    .line 45
    .line 46
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 70
    .line 71
    new-instance v4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v5, "createDialog default Dialog Id="

    .line 74
    .line 75
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 103
    .line 104
    if-eqz v2, :cond_4

    .line 105
    .line 106
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_4

    .line 125
    .line 126
    :cond_1
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 127
    .line 128
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_2

    .line 133
    .line 134
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 135
    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v3, "createDialog early Dialog found : earlyDialogId="

    .line 139
    .line 140
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v3, " earlyDialog= "

    .line 147
    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_2
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->isFinalResponse()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_3

    .line 166
    .line 167
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    :cond_3
    return-object v2

    .line 173
    :cond_4
    new-instance p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 174
    .line 175
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 176
    .line 177
    .line 178
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 179
    .line 180
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_5

    .line 185
    .line 186
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 187
    .line 188
    new-instance p2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v0, "createDialog early Dialog not found : earlyDialogId="

    .line 191
    .line 192
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v0, " created one "

    .line 199
    .line 200
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_5
    return-object p0
.end method

.method public createDialog(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 0

    .line 232
    new-instance p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-object p0
.end method

.method public createDialog(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 5

    .line 214
    instance-of v0, p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    if-eqz v0, :cond_6

    .line 215
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    move-result-object v0

    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    move-result-object v0

    .line 216
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v2, 0x20

    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 217
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v3, "createDialog dialogId="

    .line 218
    invoke-static {v3, v0, v1}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 219
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 220
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 221
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v3

    sget-object v4, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    if-ne v3, v4, :cond_1

    goto :goto_0

    .line 222
    :cond_1
    new-instance v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    invoke-direct {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 223
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 224
    :cond_2
    :goto_0
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 225
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "createDialog early Dialog found : earlyDialogId="

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " earlyDialog= "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_3
    return-object v1

    .line 226
    :cond_4
    new-instance v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    invoke-direct {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 227
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p0

    if-eqz p0, :cond_5

    .line 229
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "createDialog early Dialog not found : earlyDialogId="

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " created one "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_5
    return-object v1

    .line 230
    :cond_6
    new-instance p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-object p0
.end method

.method public createMessageChannel(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageProcessor;Landroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/core/Host;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p3}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/Host;->setHostname(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Landroid/gov/nist/core/HostPort;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p3}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p1, p0}, Landroid/gov/nist/core/HostPort;->setPort(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->createMessageChannel(Landroid/gov/nist/core/HostPort;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public createMessageProcessor(Ljava/net/InetAddress;ILjava/lang/String;)Landroid/gov/nist/javax/sip/stack/MessageProcessor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessorFactory:Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;->createMessageProcessor(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Ljava/net/InetAddress;ILjava/lang/String;)Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addMessageProcessor(Landroid/gov/nist/javax/sip/stack/MessageProcessor;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public createRawMessageChannel(Ljava/lang/String;ILandroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 8

    .line 1
    const-string v0, " "

    .line 2
    .line 3
    new-instance v1, Landroid/gov/nist/core/Host;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/gov/nist/core/Host;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p3}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Landroid/gov/nist/core/Host;->setHostname(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Landroid/gov/nist/core/HostPort;

    .line 16
    .line 17
    invoke-direct {v2}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p3}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v2, v1}, Landroid/gov/nist/core/HostPort;->setPort(I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v3, 0x0

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/16 v5, 0x20

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 52
    .line 53
    invoke-interface {p3}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_0

    .line 66
    .line 67
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_0

    .line 80
    .line 81
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-ne p2, v6, :cond_0

    .line 86
    .line 87
    :try_start_0
    invoke-virtual {v4, v2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->createMessageChannel(Landroid/gov/nist/core/HostPort;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 88
    .line 89
    .line 90
    move-result-object v3
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_0

    .line 92
    :catch_0
    move-exception v4

    .line 93
    sget-object v6, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 94
    .line 95
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_0

    .line 100
    .line 101
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 102
    .line 103
    new-instance v6, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v7, "host is reachable "

    .line 106
    .line 107
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-interface {v5, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :catch_1
    move-exception p0

    .line 132
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 133
    .line 134
    invoke-interface {p1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_1

    .line 139
    .line 140
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 141
    .line 142
    new-instance p2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string p3, "host is not known "

    .line 145
    .line 146
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_1
    throw p0

    .line 170
    :cond_2
    if-nez v3, :cond_4

    .line 171
    .line 172
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 173
    .line 174
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_4

    .line 179
    .line 180
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 181
    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v4, "newChanne is null, messageProcessors.size = "

    .line 185
    .line 186
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 190
    .line 191
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 206
    .line 207
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_3

    .line 216
    .line 217
    if-nez v3, :cond_3

    .line 218
    .line 219
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 224
    .line 225
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 226
    .line 227
    new-instance v4, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v5, "nextProcessor:"

    .line 230
    .line 231
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v5, "| transport = "

    .line 238
    .line 239
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v5, " ipAddress="

    .line 250
    .line 251
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v5, " port="

    .line 262
    .line 263
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_3
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 282
    .line 283
    const-string v0, "More info on newChannel=null"

    .line 284
    .line 285
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 289
    .line 290
    new-instance v0, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string v1, "nextHop="

    .line 293
    .line 294
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string p3, " sourceIp="

    .line 301
    .line 302
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string p1, " sourcePort="

    .line 309
    .line 310
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string p1, " targetHostPort="

    .line 317
    .line 318
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    :cond_4
    return-object v3
.end method

.method public createServerTransaction(Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->unlimitedServerTransactionTableSize:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTableLowaterMark:I

    .line 18
    .line 19
    sub-int/2addr v0, v1

    .line 20
    int-to-float v0, v0

    .line 21
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTableHighwaterMark:I

    .line 22
    .line 23
    sub-int/2addr v2, v1

    .line 24
    int-to-float v1, v2

    .line 25
    div-float/2addr v0, v1

    .line 26
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 31
    .line 32
    float-to-double v5, v0

    .line 33
    sub-double/2addr v3, v5

    .line 34
    cmpl-double v0, v1, v3

    .line 35
    .line 36
    if-lez v0, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 41
    .line 42
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public decrementActiveClientTransactionCount()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->activeClientTransactionCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTableLowaterMark:I

    .line 8
    .line 9
    if-gt v0, v1, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->unlimitedClientTransactionTableSize:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0

    .line 28
    :cond_0
    return-void
.end method

.method public declared-synchronized dialogErrorEvent(Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    instance-of v0, v0, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1
.end method

.method public disableLogging()V
    .locals 0

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->disableLogging()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public enableLogging()V
    .locals 0

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->enableLogging()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public findCancelTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;
    .locals 4

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "findCancelTransaction request= \n"

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, "\nfindCancelRequest isServer="

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 61
    .line 62
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 63
    .line 64
    invoke-interface {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->doesCancelMatchTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    return-object p2

    .line 71
    :cond_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 92
    .line 93
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 94
    .line 95
    invoke-interface {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->doesCancelMatchTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    return-object p2

    .line 102
    :cond_4
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 103
    .line 104
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_5

    .line 109
    .line 110
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 111
    .line 112
    const-string p1, "Could not find transaction for cancel request"

    .line 113
    .line 114
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    const/4 p0, 0x0

    .line 118
    return-object p0
.end method

.method public findMergedTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "INVITE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMergeId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mergeTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const-string v4, " with "

    .line 31
    .line 32
    const/16 v5, 0x20

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {v2, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 43
    .line 44
    invoke-interface {p0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 51
    .line 52
    new-instance p1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "Mathcing merged transaction for merge id "

    .line 55
    .line 56
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return v3

    .line 76
    :cond_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverDialogMergeTestTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 83
    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    iget-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionIsServerTransaction:Z

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v2, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    .line 95
    .line 96
    if-ne p1, v2, :cond_4

    .line 97
    .line 98
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 99
    .line 100
    invoke-interface {p1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 107
    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v2, "Mathcing merged dialog for merge id "

    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    return v3

    .line 132
    :cond_4
    return v1
.end method

.method public findPendingTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;
    .locals 2

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const-string v1, "looking for pending tx for :"

    .line 14
    .line 15
    invoke-static {v1, p1, v0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 25
    .line 26
    return-object p0
.end method

.method public findSubscribeTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/ListeningPointImpl;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;
    .locals 12

    .line 1
    const-string p2, "findSubscribeTransaction : returning "

    .line 2
    .line 3
    const-string v0, "ct table size = "

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    invoke-interface {v5, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    new-instance v6, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v5, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    const-string v5, "findSubscribeTransaction : returning null"

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 71
    .line 72
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 79
    .line 80
    invoke-interface {p0, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v3

    .line 84
    :cond_1
    :try_start_1
    const-string v6, "Event"

    .line 85
    .line 86
    invoke-virtual {p1, v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Landroid/gov/nist/javax/sip/header/Event;

    .line 91
    .line 92
    if-nez v6, :cond_4

    .line 93
    .line 94
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 95
    .line 96
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_2

    .line 101
    .line 102
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 103
    .line 104
    const-string p1, "event Header is null -- returning null"

    .line 105
    .line 106
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_2
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 110
    .line 111
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_3

    .line 116
    .line 117
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 118
    .line 119
    invoke-interface {p0, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    return-object v3

    .line 123
    :cond_4
    :goto_1
    :try_start_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_d

    .line 128
    .line 129
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 134
    .line 135
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    const-string v8, "SUBSCRIBE"

    .line 140
    .line 141
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_5

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getOriginalRequestFromTag()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getOriginalRequestEvent()Landroid/gov/nist/javax/sip/header/Event;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    if-nez v8, :cond_6

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 160
    .line 161
    invoke-interface {v9, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-eqz v9, :cond_8

    .line 166
    .line 167
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 168
    .line 169
    new-instance v10, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v11, "ct.fromTag = "

    .line 175
    .line 176
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 190
    .line 191
    new-instance v10, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v11, "thisToTag = "

    .line 197
    .line 198
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 212
    .line 213
    new-instance v10, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const-string v11, "hisEvent = "

    .line 219
    .line 220
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 234
    .line 235
    new-instance v10, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const-string v11, "eventHdr "

    .line 241
    .line 242
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 256
    .line 257
    new-instance v10, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const-string v11, "ct.req.contact = "

    .line 263
    .line 264
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getOriginalRequestContact()Landroid/gov/nist/javax/sip/header/Contact;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    if-eqz v9, :cond_7

    .line 286
    .line 287
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 288
    .line 289
    new-instance v10, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string v11, "ct.req.reqURI = "

    .line 295
    .line 296
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    invoke-virtual {v11}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 304
    .line 305
    .line 306
    move-result-object v11

    .line 307
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    :cond_7
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 318
    .line 319
    new-instance v10, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    const-string v11, "msg.Contact= "

    .line 325
    .line 326
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeader()Landroid/gov/nist/javax/sip/header/Contact;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    sget-object v9, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 344
    .line 345
    new-instance v10, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const-string v11, "msg.reqURI "

    .line 351
    .line 352
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_8
    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    if-eqz v7, :cond_4

    .line 374
    .line 375
    invoke-virtual {v6, v8}, Landroid/gov/nist/javax/sip/header/Event;->match(Landroid/gov/nist/javax/sip/header/Event;)Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    if-eqz v7, :cond_4

    .line 380
    .line 381
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-interface {v7}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getOriginalRequestCallId()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    if-eqz v7, :cond_4

    .line 398
    .line 399
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDeliverUnsolicitedNotify()Z

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    if-nez v7, :cond_9

    .line 404
    .line 405
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->acquireSem()Z

    .line 406
    .line 407
    .line 408
    :cond_9
    if-nez v3, :cond_a

    .line 409
    .line 410
    move-object v3, v5

    .line 411
    :cond_a
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    if-eqz v7, :cond_4

    .line 416
    .line 417
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 422
    .line 423
    .line 424
    move-result-object v8

    .line 425
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeader()Landroid/gov/nist/javax/sip/header/Contact;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/header/Contact;->getAddress()Landroid/javax/sip/address/Address;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    invoke-interface {v8}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-eqz v7, :cond_4

    .line 442
    .line 443
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    if-nez v7, :cond_b

    .line 448
    .line 449
    invoke-interface {v5, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    if-eqz v7, :cond_4

    .line 454
    .line 455
    :cond_b
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 456
    .line 457
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 458
    .line 459
    .line 460
    move-result p0

    .line 461
    if-eqz p0, :cond_c

    .line 462
    .line 463
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 464
    .line 465
    new-instance p1, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 468
    .line 469
    .line 470
    const-string v0, "Tx compl conditions met."

    .line 471
    .line 472
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 483
    .line 484
    .line 485
    :cond_c
    move-object v3, v5

    .line 486
    :cond_d
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 487
    .line 488
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 489
    .line 490
    .line 491
    move-result p0

    .line 492
    if-eqz p0, :cond_e

    .line 493
    .line 494
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 495
    .line 496
    new-instance p1, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    :cond_e
    return-object v3

    .line 512
    :goto_2
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 513
    .line 514
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 515
    .line 516
    .line 517
    move-result p1

    .line 518
    if-eqz p1, :cond_f

    .line 519
    .line 520
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 521
    .line 522
    new-instance v0, Ljava/lang/StringBuilder;

    .line 523
    .line 524
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p2

    .line 534
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    :cond_f
    throw p0
.end method

.method public findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;
    .locals 7

    .line 1
    const-string v0, "clientTx: looking for key "

    .line 2
    .line 3
    const-string v1, "serverTx: looking for key "

    .line 4
    .line 5
    const-string v2, "z9hg4bk"

    .line 6
    .line 7
    const-string v3, "findTransaction: returning  : "

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz p2, :cond_6

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    .line 36
    :try_start_1
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 37
    .line 38
    invoke-interface {v5, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    new-instance v6, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, " existing="

    .line 55
    .line 56
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v5, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    move-object v5, v0

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_0
    :goto_0
    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    if-eqz p2, :cond_2

    .line 81
    .line 82
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 83
    .line 84
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 91
    .line 92
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_1
    return-object v0

    .line 108
    :cond_2
    move-object v5, v0

    .line 109
    goto :goto_2

    .line 110
    :catchall_1
    move-exception p0

    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_3
    :goto_2
    :try_start_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-eqz p2, :cond_d

    .line 128
    .line 129
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 134
    .line 135
    invoke-interface {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 136
    .line 137
    .line 138
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 142
    .line 143
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_5

    .line 148
    .line 149
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 150
    .line 151
    new-instance p1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    return-object p2

    .line 167
    :cond_6
    :try_start_3
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    if-eqz p2, :cond_a

    .line 176
    .line 177
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 182
    .line 183
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_7

    .line 188
    .line 189
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 190
    .line 191
    new-instance v6, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 207
    .line 208
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 213
    .line 214
    :try_start_4
    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 218
    if-eqz p2, :cond_9

    .line 219
    .line 220
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 221
    .line 222
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eqz p0, :cond_8

    .line 227
    .line 228
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 229
    .line 230
    new-instance p1, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :cond_8
    return-object v0

    .line 238
    :cond_9
    move-object v5, v0

    .line 239
    :cond_a
    :try_start_5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 240
    .line 241
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result p2

    .line 253
    if-eqz p2, :cond_d

    .line 254
    .line 255
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 260
    .line 261
    invoke-interface {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 262
    .line 263
    .line 264
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 265
    if-eqz v0, :cond_b

    .line 266
    .line 267
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 268
    .line 269
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    if-eqz p0, :cond_c

    .line 274
    .line 275
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 276
    .line 277
    new-instance p1, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_c
    return-object p2

    .line 284
    :cond_d
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 285
    .line 286
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-eqz p0, :cond_e

    .line 291
    .line 292
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 293
    .line 294
    new-instance p1, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    :cond_e
    return-object v5

    .line 310
    :goto_4
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 311
    .line 312
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-eqz p1, :cond_f

    .line 317
    .line 318
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 319
    .line 320
    new-instance p2, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p2

    .line 332
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :cond_f
    throw p0
.end method

.method public findTransaction(Ljava/lang/String;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;
    .locals 0

    if-eqz p2, :cond_0

    .line 336
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    return-object p0

    .line 337
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    return-object p0
.end method

.method public findTransactionPendingAck(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 16
    .line 17
    return-object p0
.end method

.method public getAckTimeoutFactor()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSipListener()Landroid/javax/sip/SipListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSipListener()Landroid/javax/sip/SipListener;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTimeoutFactor:I

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const/16 p0, 0x40

    .line 19
    .line 20
    return p0
.end method

.method public getActiveClientTransactionCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->activeClientTransactionCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getAddressResolver()Landroid/gov/nist/core/net/AddressResolver;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addressResolver:Landroid/gov/nist/core/net/AddressResolver;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientAuth:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClientTransactionTableSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getConnectionLingerTimer()I
    .locals 0

    .line 1
    sget p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->connectionLingerTimer:I

    .line 2
    .line 3
    return p0
.end method

.method public getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 3

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "getDialog("

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, ") : returning "

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-object p0
.end method

.method public getDialogs()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Landroid/javax/sip/Dialog;",
            ">;"
        }
    .end annotation

    .line 67
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 68
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 69
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public getDialogs(Landroid/javax/sip/DialogState;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/javax/sip/DialogState;",
            ")",
            "Ljava/util/Collection<",
            "Landroid/javax/sip/Dialog;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Landroid/javax/sip/DialogState;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2, p1}, Landroid/javax/sip/DialogState;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object v0
.end method

.method public getEarlyDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 3

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "getEarlyDialog("

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, ") : returning "

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-object p0
.end method

.method public getEarlyDialogTimeout()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTimeout:I

    .line 2
    .line 3
    return p0
.end method

.method public getForkedTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 8
    .line 9
    return-object p0
.end method

.method public getHostAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getJoinDialog(Landroid/gov/nist/javax/sip/header/extensions/JoinHeader;)Landroid/javax/sip/Dialog;
    .locals 3

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/header/extensions/JoinHeader;->getCallId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/header/extensions/JoinHeader;->getFromTag()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/header/extensions/JoinHeader;->getToTag()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, ":"

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Landroid/javax/sip/Dialog;

    .line 51
    .line 52
    return-object p0
.end method

.method public getLocalAddressForTcpDst(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/SocketAddress;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageProcessorFactory()Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/gov/nist/javax/sip/stack/NioMessageProcessorFactory;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageProcessors()[Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length p3, p0

    .line 14
    const/4 p4, 0x0

    .line 15
    :goto_0
    if-ge p4, p3, :cond_1

    .line 16
    .line 17
    aget-object v0, p0, p4

    .line 18
    .line 19
    const-string v1, "TCP"

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 36
    .line 37
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_0
    add-int/lit8 p4, p4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->ioHandler:Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/gov/nist/javax/sip/stack/IOHandler;->getLocalAddressForTcpDst(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/SocketAddress;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public getLocalAddressForTlsDst(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljava/net/SocketAddress;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageProcessors()[Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_2

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    instance-of v4, v3, Landroid/gov/nist/javax/sip/stack/TLSMessageProcessor;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3, p1, p2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;

    .line 20
    .line 21
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->ioHandler:Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/gov/nist/javax/sip/stack/IOHandler;->getLocalAddressForTlsDst(Ljava/net/InetAddress;ILjava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;)Ljava/net/SocketAddress;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    instance-of v4, v3, Landroid/gov/nist/javax/sip/stack/NioTlsMessageProcessor;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, p1, p2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 37
    .line 38
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 p0, 0x0

    .line 53
    return-object p0
.end method

.method public getMaxForkTime()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxForkTime:I

    .line 2
    .line 3
    return p0
.end method

.method public getMaxMessageSize()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxMessageSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getMaxTxLifetimeInvite()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeInvite:I

    .line 2
    .line 3
    return p0
.end method

.method public getMaxTxLifetimeNonInvite()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeNonInvite:I

    .line 2
    .line 3
    return p0
.end method

.method public getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageParserFactory:Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMessageProcessorFactory()Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessorFactory:Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMessageProcessors()[Landroid/gov/nist/javax/sip/stack/MessageProcessor;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 5
    .line 6
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, [Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 11
    .line 12
    return-object p0
.end method

.method public getMinKeepAliveInterval()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->minKeepAliveInterval:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getNetworkLayer()Landroid/gov/nist/core/net/NetworkLayer;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->networkLayer:Landroid/gov/nist/core/net/NetworkLayer;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Landroid/gov/nist/core/net/DefaultNetworkLayer;->SINGLETON:Landroid/gov/nist/core/net/DefaultNetworkLayer;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public getNextHop(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/javax/sip/address/Hop;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->useRouterForAll:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->router:Landroid/javax/sip/address/Router;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, p1}, Landroid/javax/sip/address/Router;->getNextHop(Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    return-object v1

    .line 16
    :cond_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Landroid/javax/sip/address/URI;->isSipURI()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->router:Landroid/javax/sip/address/Router;

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    invoke-interface {p0, p1}, Landroid/javax/sip/address/Router;->getNextHop(Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_3
    return-object v1

    .line 43
    :cond_4
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->defaultRouter:Landroid/gov/nist/javax/sip/stack/DefaultRouter;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->getNextHop(Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public getReceiveUdpBufferSize()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->receiveUdpBufferSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getReinviteExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->reinviteExecutor:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReliableConnectionKeepAliveTimeout()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->reliableConnectionKeepAliveTimeout:I

    .line 2
    .line 3
    return p0
.end method

.method public getReplacesDialog(Landroid/gov/nist/javax/sip/header/extensions/ReplacesHeader;)Landroid/javax/sip/Dialog;
    .locals 5

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/header/extensions/ReplacesHeader;->getCallId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/header/extensions/ReplacesHeader;->getFromTag()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/header/extensions/ReplacesHeader;->getToTag()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v4}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    iget-object v4, v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseFromTag:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    iget-object v4, v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseToTag:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_0

    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, ":"

    .line 72
    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_2
    if-eqz v1, :cond_3

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 98
    .line 99
    const/16 v1, 0x20

    .line 100
    .line 101
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 108
    .line 109
    const-string v1, "Looking for dialog "

    .line 110
    .line 111
    invoke-static {v1, p1, v0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Landroid/javax/sip/Dialog;

    .line 121
    .line 122
    if-nez v0, :cond_6

    .line 123
    .line 124
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 145
    .line 146
    invoke-interface {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    if-eqz v2, :cond_5

    .line 151
    .line 152
    invoke-interface {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :cond_6
    return-object v0
.end method

.method public getRetransmissionAlertTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 8
    .line 9
    return-object p0
.end method

.method public getRouter()Landroid/javax/sip/address/Router;
    .locals 0

    .line 61
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->router:Landroid/javax/sip/address/Router;

    return-object p0
.end method

.method public getRouter(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/javax/sip/address/Router;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestLine()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->defaultRouter:Landroid/gov/nist/javax/sip/stack/DefaultRouter;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->useRouterForAll:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->router:Landroid/javax/sip/address/Router;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/javax/sip/address/URI;->getScheme()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "sip"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Landroid/javax/sip/address/URI;->getScheme()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "sips"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->router:Landroid/javax/sip/address/Router;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->defaultRouter:Landroid/gov/nist/javax/sip/stack/DefaultRouter;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_4
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->defaultRouter:Landroid/gov/nist/javax/sip/stack/DefaultRouter;

    .line 59
    .line 60
    return-object p0
.end method

.method public getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->selfRoutingThreadpoolExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Landroid/gov/nist/javax/sip/ThreadAffinityExecutor;

    .line 10
    .line 11
    const/16 v0, 0x10

    .line 12
    .line 13
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/ThreadAffinityExecutor;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->selfRoutingThreadpoolExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, Landroid/gov/nist/javax/sip/ThreadAffinityExecutor;

    .line 20
    .line 21
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 22
    .line 23
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/ThreadAffinityExecutor;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->selfRoutingThreadpoolExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    :cond_1
    return-object v0
.end method

.method public getSendUdpBufferSize()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sendUdpBufferSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getServerLogger()Landroid/gov/nist/core/ServerLogger;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverLogger:Landroid/gov/nist/core/ServerLogger;

    .line 2
    .line 3
    return-object p0
.end method

.method public getServerTransactionTableSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public abstract getSipListener()Landroid/javax/sip/SipListener;
.end method

.method public getSslHandshakeTimeout()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sslHandshakeTimeout:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getStackCongestionControlTimeout()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackCongestionControlTimeout:I

    .line 2
    .line 3
    return p0
.end method

.method public getStackLogger()Landroid/gov/nist/core/StackLogger;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTcpPostParsingThreadPoolSize()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->tcpPostParsingThreadPoolSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadAuditor:Landroid/gov/nist/core/ThreadAuditor;

    .line 2
    .line 3
    return-object p0
.end method

.method public getThreadPriority()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPriority:I

    .line 2
    .line 3
    return p0
.end method

.method public getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 2
    .line 3
    return-object p0
.end method

.method public isAggressiveCleanup()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x1

    .line 10
    return p0
.end method

.method public isAlive()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->toExit:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public isCancelClientTransactionChecked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cancelClientTransactionChecked:Z

    .line 2
    .line 3
    return p0
.end method

.method public isDeliverRetransmittedAckToListener()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverRetransmittedAckToListener:Z

    .line 2
    .line 3
    return p0
.end method

.method public isDeliverTerminatedEventForAck()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverTerminatedEventForAck:Z

    .line 2
    .line 3
    return p0
.end method

.method public isDeliverUnsolicitedNotify()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverUnsolicitedNotify:Z

    .line 2
    .line 3
    return p0
.end method

.method public isEventForked(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const-string v1, "isEventForked: "

    .line 14
    .line 15
    const-string v2, " returning "

    .line 16
    .line 17
    invoke-static {v1, p1, v2}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedEvents:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedEvents:Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public isLogStackTraceOnMessageSend()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logStackTraceOnMessageSend:Z

    .line 2
    .line 3
    return p0
.end method

.method public isLoggingEnabled()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isLoggingEnabled(I)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 12
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p0

    return p0
.end method

.method public isNon2XXAckPassedToListener()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->non2XXAckPassedToListener:Z

    .line 2
    .line 3
    return p0
.end method

.method public isPatchReceivedRport()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchReceivedRport:Z

    .line 2
    .line 3
    return p0
.end method

.method public isPatchRport()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchRport:Z

    .line 2
    .line 3
    return p0
.end method

.method public isPatchWebSocketHeaders()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchWebSocketHeaders:Z

    .line 2
    .line 3
    return p0
.end method

.method public isRemoteTagReassignmentAllowed()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->remoteTagReassignmentAllowed:Z

    .line 2
    .line 3
    return p0
.end method

.method public isRfc2543Supported()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->rfc2543Supported:Z

    .line 2
    .line 3
    return p0
.end method

.method public isSslRenegotiationEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sslRenegotiationEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public isTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public mapTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionHash(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    invoke-interface {p1, p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setTransactionMapped(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public newSIPServerRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMessageChannel(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x20

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;

    .line 36
    .line 37
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 38
    .line 39
    invoke-interface {v5, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 46
    .line 47
    new-instance v6, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v7, "Checking SIP message valve "

    .line 53
    .line 54
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v7, " for Request = "

    .line 61
    .line 62
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-interface {v5, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catch_0
    move-exception p0

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    :goto_0
    invoke-interface {v4, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;->processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_0

    .line 87
    .line 88
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 89
    .line 90
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_2

    .line 95
    .line 96
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 97
    .line 98
    new-instance p2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v0, "Request dropped by the SIP message valve. Request = "

    .line 104
    .line 105
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-interface {p0, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    :cond_2
    return-object v3

    .line 119
    :goto_1
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 120
    .line 121
    const/4 v0, 0x4

    .line 122
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_3

    .line 127
    .line 128
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 129
    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v1, "An issue happening the valve on request "

    .line 133
    .line 134
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p1, " thus the message will not be processed further"

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-interface {p2, p1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    return-object v3

    .line 153
    :cond_4
    const/4 v1, 0x1

    .line 154
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Ljava/lang/String;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 159
    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    invoke-interface {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_b

    .line 167
    .line 168
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    const-string v4, "z9hg4bk"

    .line 173
    .line 174
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-nez v1, :cond_8

    .line 179
    .line 180
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    move-object v4, v3

    .line 191
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_7

    .line 196
    .line 197
    if-nez v4, :cond_7

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    check-cast v5, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 204
    .line 205
    invoke-interface {v5, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_6

    .line 210
    .line 211
    move-object v4, v5

    .line 212
    goto :goto_2

    .line 213
    :cond_7
    move-object v1, v4

    .line 214
    goto :goto_3

    .line 215
    :cond_8
    move-object v1, v3

    .line 216
    :goto_3
    if-nez v1, :cond_b

    .line 217
    .line 218
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findPendingTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-eqz v0, :cond_a

    .line 223
    .line 224
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setTransaction(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->acquireSem()Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-eqz p0, :cond_9

    .line 232
    .line 233
    return-object v0

    .line 234
    :cond_9
    return-object v3

    .line 235
    :cond_a
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createServerTransaction(Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_b

    .line 240
    .line 241
    invoke-interface {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setTransaction(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_b
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 248
    .line 249
    invoke-interface {p2, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 250
    .line 251
    .line 252
    move-result p2

    .line 253
    if-eqz p2, :cond_c

    .line 254
    .line 255
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 256
    .line 257
    new-instance v0, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v2, "newSIPServerRequest( "

    .line 260
    .line 261
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v2, ":"

    .line 272
    .line 273
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v2, "):"

    .line 288
    .line 289
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :cond_c
    if-eqz v1, :cond_d

    .line 303
    .line 304
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageFactory:Landroid/gov/nist/javax/sip/stack/StackMessageFactory;

    .line 305
    .line 306
    invoke-interface {p0, p1, v1}, Landroid/gov/nist/javax/sip/stack/StackMessageFactory;->newSIPServerRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-interface {v1, p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setRequestInterface(Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;)V

    .line 311
    .line 312
    .line 313
    :cond_d
    if-eqz v1, :cond_e

    .line 314
    .line 315
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->acquireSem()Z

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    if-eqz p0, :cond_e

    .line 320
    .line 321
    return-object v1

    .line 322
    :cond_e
    if-eqz v1, :cond_f

    .line 323
    .line 324
    :try_start_1
    invoke-interface {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    if-eqz p0, :cond_f

    .line 329
    .line 330
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result p0

    .line 342
    if-eqz p0, :cond_f

    .line 343
    .line 344
    const/16 p0, 0x64

    .line 345
    .line 346
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeContent()V

    .line 351
    .line 352
    .line 353
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 358
    .line 359
    .line 360
    goto :goto_4

    .line 361
    :catch_1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 362
    .line 363
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    if-eqz p0, :cond_f

    .line 368
    .line 369
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 370
    .line 371
    const-string p1, "Exception occured sending TRYING"

    .line 372
    .line 373
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    :cond_f
    :goto_4
    return-object v3
.end method

.method public newSIPServerResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;
    .locals 8

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;

    .line 29
    .line 30
    invoke-interface {v3, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;->processResponse(Landroid/javax/sip/message/Response;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 37
    .line 38
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v0, "Response dropped by the SIP message valve. Response = "

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-interface {p0, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_0
    move-exception p0

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    :goto_0
    return-object v2

    .line 70
    :goto_1
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 80
    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v1, "An issue happening the valve on response "

    .line 84
    .line 85
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p1, " thus the message will not be processed further"

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p2, p1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-object v2

    .line 104
    :cond_3
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/4 v3, 0x0

    .line 109
    invoke-virtual {p0, v0, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Ljava/lang/String;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 114
    .line 115
    const-string v4, "before processing"

    .line 116
    .line 117
    const/16 v5, 0x10

    .line 118
    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    invoke-interface {v3, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-nez v6, :cond_8

    .line 126
    .line 127
    const-string v6, "z9hg4bk"

    .line 128
    .line 129
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_8

    .line 134
    .line 135
    :cond_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    move-object v3, v2

    .line 146
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_6

    .line 151
    .line 152
    if-nez v3, :cond_6

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    check-cast v6, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 159
    .line 160
    invoke-interface {v6, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_5

    .line 165
    .line 166
    move-object v3, v6

    .line 167
    goto :goto_2

    .line 168
    :cond_6
    if-nez v3, :cond_8

    .line 169
    .line 170
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 171
    .line 172
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_7

    .line 177
    .line 178
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 179
    .line 180
    .line 181
    move-result-wide v0

    .line 182
    invoke-virtual {p2, p1, v0, v1, v4}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->logResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;JLjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :cond_7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageFactory:Landroid/gov/nist/javax/sip/stack/StackMessageFactory;

    .line 186
    .line 187
    invoke-interface {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/StackMessageFactory;->newSIPServerResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :cond_8
    invoke-interface {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->acquireSem()Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 197
    .line 198
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    invoke-interface {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 209
    .line 210
    .line 211
    move-result-wide v5

    .line 212
    invoke-virtual {v0, p1, v5, v6, v4}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->logResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;JLjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :cond_9
    if-eqz p2, :cond_c

    .line 216
    .line 217
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageFactory:Landroid/gov/nist/javax/sip/stack/StackMessageFactory;

    .line 218
    .line 219
    invoke-interface {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-interface {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/StackMessageFactory;->newSIPServerResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    if-eqz p0, :cond_a

    .line 228
    .line 229
    invoke-interface {v3, p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setResponseInterface(Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;)V

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_a
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 234
    .line 235
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    if-eqz p0, :cond_b

    .line 240
    .line 241
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 242
    .line 243
    const-string p1, "returning null - serverResponseInterface is null!"

    .line 244
    .line 245
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_b
    invoke-interface {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 249
    .line 250
    .line 251
    return-object v2

    .line 252
    :cond_c
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 253
    .line 254
    const-string p1, "Application is blocked -- could not acquire semaphore -- dropping response"

    .line 255
    .line 256
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :goto_3
    if-eqz p2, :cond_d

    .line 260
    .line 261
    return-object v3

    .line 262
    :cond_d
    return-object v2
.end method

.method public printDialogTable()V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "dialog table  = "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    const-string v1, "putDialog: dialog already exists"

    .line 26
    .line 27
    const-string v2, " in table = "

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 59
    .line 60
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 67
    .line 68
    new-instance v3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v4, "putDialog dialogId="

    .line 71
    .line 72
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v4, " dialog = "

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setStack(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 94
    .line 95
    .line 96
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 97
    .line 98
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 105
    .line 106
    invoke-interface {v1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 107
    .line 108
    .line 109
    :cond_3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 110
    .line 111
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putMergeDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 115
    .line 116
    .line 117
    return-object p1
.end method

.method public putInMergeTable(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMergeId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mergeTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {p0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public putMergeDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMergeId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverDialogMergeTestTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    const/16 v1, 0x20

    .line 17
    .line 18
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "put Dialog "

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, " in serverDialogMerge table with Merge Dialog Id "

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public putPendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "putPendingTransaction: "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public reInit()V
    .locals 2

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const-string v1, "Re-initializing !"

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 24
    .line 25
    new-instance v0, Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/IOHandler;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->ioHandler:Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mergeTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverDialogMergeTestTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 94
    .line 95
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 101
    .line 102
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->activeClientTransactionCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 109
    .line 110
    return-void
.end method

.method public removeDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getEarlyDialogId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMergeId()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeMergeDialog(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-ne v2, p1, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->testAndSetIsDialogTerminatedEventDelivered()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_3

    .line 49
    .line 50
    new-instance p0, Landroid/javax/sip/DialogTerminatedEvent;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {p0, v0, p1}, Landroid/javax/sip/DialogTerminatedEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/Dialog;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, p0, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogTerminatedEventDeliveredForNullDialog:Z

    .line 68
    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->testAndSetIsDialogTerminatedEventDelivered()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_3

    .line 76
    .line 77
    new-instance p0, Landroid/javax/sip/DialogTerminatedEvent;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {p0, v0, p1}, Landroid/javax/sip/DialogTerminatedEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/Dialog;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1, p0, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void
.end method

.method public removeDialog(Ljava/lang/String;)V
    .locals 2

    .line 94
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "Silently removing dialog from table"

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 96
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeFromMergeTable(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 2

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const-string v1, "Removing tx from merge table "

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMergeId()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mergeTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public removeMergeDialog(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 4
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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    const-string v2, "Tyring to remove Dialog from serverDialogMerge table with Merge Dialog Id "

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverDialogMergeTestTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 31
    .line 32
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 33
    .line 34
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "removed Dialog "

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, " from serverDialogMerge table with Merge Dialog Id "

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method public removeMessageProcessor(Landroid/gov/nist/javax/sip/stack/MessageProcessor;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessors:Ljava/util/Collection;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->stop()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public removePendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "removePendingTx: "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 9

    .line 1
    const-string v1, "removeTransaction: Table size :  clientTransactionTable %d  serverTransactionTable %d  mergetTable %d  terminatedServerTransactionsPendingAck %d   forkedClientTransactionTable %d  pendingTransactions %d "

    .line 2
    .line 3
    const-string v0, "Scheduling to remove forked client transaction : forkId = "

    .line 4
    .line 5
    const-string v2, "REMOVED client tx "

    .line 6
    .line 7
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 18
    .line 19
    new-instance v5, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v6, "removeTransaction: Removing Transaction = "

    .line 22
    .line 23
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v6, " transaction = "

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-interface {v3, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    const/4 v3, 0x0

    .line 49
    :try_start_0
    instance-of v5, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 50
    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 54
    .line 55
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 62
    .line 63
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object p1, v0

    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v2, p1

    .line 86
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 87
    .line 88
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removePendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 89
    .line 90
    .line 91
    move-object v2, p1

    .line 92
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 93
    .line 94
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z

    .line 95
    .line 96
    .line 97
    const-string v2, "INVITE"

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    move-object v0, p1

    .line 106
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeFromMergeTable(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->testAndSetTransactionTerminatedEvent()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_7

    .line 122
    .line 123
    new-instance v2, Landroid/javax/sip/TransactionTerminatedEvent;

    .line 124
    .line 125
    move-object v5, p1

    .line 126
    check-cast v5, Landroid/javax/sip/ServerTransaction;

    .line 127
    .line 128
    invoke-direct {v2, v0, v5}, Landroid/javax/sip/TransactionTerminatedEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v2, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_1

    .line 135
    .line 136
    :cond_3
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 141
    .line 142
    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    sget-object v6, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 147
    .line 148
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_4

    .line 153
    .line 154
    sget-object v6, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 155
    .line 156
    new-instance v7, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v2, " KEY = "

    .line 165
    .line 166
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-interface {v6, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_4
    if-eqz v3, :cond_6

    .line 180
    .line 181
    move-object v2, v3

    .line 182
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 183
    .line 184
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getForkId()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    if-eqz v5, :cond_6

    .line 189
    .line 190
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_6

    .line 195
    .line 196
    iget v6, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxForkTime:I

    .line 197
    .line 198
    if-eqz v6, :cond_6

    .line 199
    .line 200
    sget-object v6, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 201
    .line 202
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-eqz v6, :cond_5

    .line 207
    .line 208
    sget-object v6, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 209
    .line 210
    new-instance v7, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v0, " in "

    .line 219
    .line 220
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxForkTime:I

    .line 224
    .line 225
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v0, " seconds"

    .line 229
    .line 230
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-interface {v6, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :cond_5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 241
    .line 242
    new-instance v6, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$RemoveForkedTransactionTimerTask;

    .line 243
    .line 244
    invoke-direct {v6, p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$RemoveForkedTransactionTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget v5, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxForkTime:I

    .line 248
    .line 249
    mul-int/lit16 v5, v5, 0x3e8

    .line 250
    .line 251
    int-to-long v7, v5

    .line 252
    invoke-interface {v0, v6, v7, v8}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 253
    .line 254
    .line 255
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->stopExpiresTimer()V

    .line 256
    .line 257
    .line 258
    :cond_6
    if-eqz v3, :cond_7

    .line 259
    .line 260
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->testAndSetTransactionTerminatedEvent()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_7

    .line 265
    .line 266
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    new-instance v2, Landroid/javax/sip/TransactionTerminatedEvent;

    .line 271
    .line 272
    move-object v5, p1

    .line 273
    check-cast v5, Landroid/javax/sip/ClientTransaction;

    .line 274
    .line 275
    invoke-direct {v2, v0, v5}, Landroid/javax/sip/TransactionTerminatedEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v2, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    .line 280
    .line 281
    :cond_7
    :goto_1
    if-eqz v3, :cond_8

    .line 282
    .line 283
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 284
    .line 285
    invoke-interface {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->cancelMaxTxLifeTimeTimer()V

    .line 286
    .line 287
    .line 288
    :cond_8
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 289
    .line 290
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-eqz p1, :cond_9

    .line 295
    .line 296
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 297
    .line 298
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mergeTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 349
    .line 350
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 351
    .line 352
    .line 353
    move-result p0

    .line 354
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_9
    return-void

    .line 370
    :goto_2
    if-eqz v3, :cond_a

    .line 371
    .line 372
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 373
    .line 374
    invoke-interface {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->cancelMaxTxLifeTimeTimer()V

    .line 375
    .line 376
    .line 377
    :cond_a
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 378
    .line 379
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_b

    .line 384
    .line 385
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 386
    .line 387
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mergeTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedClientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 428
    .line 429
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 438
    .line 439
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 440
    .line 441
    .line 442
    move-result p0

    .line 443
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    :cond_b
    throw p1
.end method

.method public removeTransactionHash(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 9
    .line 10
    const/16 v1, 0x20

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 29
    .line 30
    .line 31
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    const-string v1, "removing client Tx : "

    .line 34
    .line 35
    invoke-static {v1, p1, v0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    instance-of v0, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 60
    .line 61
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 68
    .line 69
    const-string v1, "removing server Tx : "

    .line 70
    .line 71
    invoke-static {v1, p1, v0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const/4 p0, 0x0

    .line 76
    :cond_4
    :goto_0
    if-eqz p0, :cond_5

    .line 77
    .line 78
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 79
    .line 80
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->cancelMaxTxLifeTimeTimer()V

    .line 81
    .line 82
    .line 83
    :cond_5
    :goto_1
    return-void
.end method

.method public removeTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBranchId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->terminatedServerTransactionsPendingAck:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public setAddressResolver(Landroid/gov/nist/core/net/AddressResolver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addressResolver:Landroid/gov/nist/core/net/AddressResolver;

    .line 2
    .line 3
    return-void
.end method

.method public setAggressiveCleanup(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 4
    .line 5
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object p1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 9
    .line 10
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 11
    .line 12
    return-void
.end method

.method public setClientAuth(Landroid/gov/nist/javax/sip/stack/ClientAuthType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientAuth:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 2
    .line 3
    return-void
.end method

.method public setConnectionLingerTimer(I)V
    .locals 0

    .line 1
    sput p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->connectionLingerTimer:I

    .line 2
    .line 3
    return-void
.end method

.method public setDeliverDialogTerminatedEventForNullDialog()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogTerminatedEventDeliveredForNullDialog:Z

    .line 3
    .line 4
    return-void
.end method

.method public setDeliverTerminatedEventForAck(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverTerminatedEventForAck:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDeliverUnsolicitedNotify(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverUnsolicitedNotify:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEarlyDialogTimeout(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTimeout:I

    .line 2
    .line 3
    return-void
.end method

.method public setHostAddress(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eq v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0x5b

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    const-string v0, "["

    .line 27
    .line 28
    const/16 v1, 0x5d

    .line 29
    .line 30
    invoke-static {v1, v0, p1}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackAddress:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackAddress:Ljava/lang/String;

    .line 38
    .line 39
    :goto_0
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackInetAddress:Ljava/net/InetAddress;

    .line 44
    .line 45
    return-void
.end method

.method public setKeepAliveTimeout(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IJ)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findMessageProcessor(Ljava/lang/String;ILjava/lang/String;)Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    instance-of v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 13
    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 23
    .line 24
    const-string v1, ", myPort="

    .line 25
    .line 26
    const-string v2, ", transport="

    .line 27
    .line 28
    const-string v3, "~~~ Trying to find MessageChannel and set new KeepAliveTimeout( myAddress="

    .line 29
    .line 30
    invoke-static {p2, v3, p1, v1, v2}, La/kng0;->p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, ", peerAddress="

    .line 35
    .line 36
    const-string v1, ", peerPort="

    .line 37
    .line 38
    invoke-static {p1, p3, p2, p4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, ", keepAliveTimeout="

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p6, p7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p2, "), MessageProcessor="

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    check-cast p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 68
    .line 69
    invoke-virtual {p0, p4, p5, p6, p7}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->setKeepAliveTimeout(Ljava/lang/String;IJ)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    return p0

    .line 74
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 75
    return p0
.end method

.method public setLogRecordFactory(Landroid/gov/nist/javax/sip/LogRecordFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logRecordFactory:Landroid/gov/nist/javax/sip/LogRecordFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setLogStackTraceOnMessageSend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logStackTraceOnMessageSend:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMaxConnections(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxConnections:I

    .line 2
    .line 3
    return-void
.end method

.method public setMaxForkTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxForkTime:I

    .line 2
    .line 3
    return-void
.end method

.method public setMaxTxLifetimeInvite(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeInvite:I

    .line 2
    .line 3
    return-void
.end method

.method public setMaxTxLifetimeNonInvite(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeNonInvite:I

    .line 2
    .line 3
    return-void
.end method

.method public setMessageFactory(Landroid/gov/nist/javax/sip/stack/StackMessageFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageFactory:Landroid/gov/nist/javax/sip/stack/StackMessageFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setMessageParserFactory(Landroid/gov/nist/javax/sip/parser/MessageParserFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageParserFactory:Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setMessageProcessorFactory(Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessorFactory:Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;

    .line 2
    .line 3
    return-void
.end method

.method public setNon2XXAckPassedToListener(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->non2XXAckPassedToListener:Z

    .line 2
    .line 3
    return-void
.end method

.method public setPatchReceivedRport(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchReceivedRport:Z

    .line 2
    .line 3
    return-void
.end method

.method public setPatchRport(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchRport:Z

    .line 6
    .line 7
    return-void
.end method

.method public setPatchWebSocketHeaders(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->patchWebSocketHeaders:Z

    .line 6
    .line 7
    return-void
.end method

.method public setReceiveUdpBufferSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->receiveUdpBufferSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setReleaseReferencesStrategy(Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    return-void
.end method

.method public setReliableConnectionKeepAliveTimeout(I)V
    .locals 3

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    const-string v1, "Default value (840000 ms) will be used for reliableConnectionKeepAliveTimeout stack property"

    .line 16
    .line 17
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const p1, 0xcd140

    .line 21
    .line 22
    .line 23
    :cond_1
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "value "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " will be used for reliableConnectionKeepAliveTimeout stack property"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->reliableConnectionKeepAliveTimeout:I

    .line 56
    .line 57
    return-void
.end method

.method public setRouter(Landroid/javax/sip/address/Router;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->router:Landroid/javax/sip/address/Router;

    .line 2
    .line 3
    return-void
.end method

.method public setSendUdpBufferSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sendUdpBufferSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setSingleThreaded()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 3
    .line 4
    return-void
.end method

.method public setSslHandshakeTimeout(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sslHandshakeTimeout:J

    .line 2
    .line 3
    return-void
.end method

.method public setSslRenegotiationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sslRenegotiationEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStackCongestionControlTimeout(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackCongestionControlTimeout:I

    .line 2
    .line 3
    return-void
.end method

.method public setStackName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTcpPostParsingThreadPoolSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->tcpPostParsingThreadPoolSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setThreadPoolSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setThreadPriority(I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_2

    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    if-gt p1, v0, :cond_1

    .line 7
    .line 8
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Setting Stack Thread priority to "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPriority:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const-string p0, "The Stack Thread Priority shouldn\'t be higher than Thread.MAX_PRIORITY"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const-string p0, "The Stack Thread Priority shouldn\'t be lower than Thread.MIN_PRIORITY"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setTimer(Landroid/gov/nist/javax/sip/stack/timers/SipTimer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 2
    .line 3
    return-void
.end method

.method public stopStack()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->toExit:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->pendingTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 7
    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 11
    .line 12
    .line 13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 20
    .line 21
    .line 22
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->selfRoutingThreadpoolExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->selfRoutingThreadpoolExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 32
    .line 33
    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->selfRoutingThreadpoolExecutor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageProcessors()[Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x0

    .line 42
    :goto_0
    array-length v2, v0

    .line 43
    if-ge v1, v2, :cond_1

    .line 44
    .line 45
    aget-object v2, v0, v1

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeMessageProcessor(Landroid/gov/nist/javax/sip/stack/MessageProcessor;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->closeAllSockets()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->stop()V

    .line 61
    .line 62
    .line 63
    :cond_2
    const-wide/16 v0, 0x3e8

    .line 64
    .line 65
    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 66
    .line 67
    .line 68
    :catch_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverLogger:Landroid/gov/nist/core/ServerLogger;

    .line 84
    .line 85
    invoke-interface {p0}, Landroid/gov/nist/core/ServerLogger;->closeLogFile()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    throw p0

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    throw v0
.end method

.method public declared-synchronized transactionErrorEvent(Landroid/gov/nist/javax/sip/stack/SIPTransactionErrorEvent;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionErrorEvent;->getErrorID()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne p1, v1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x5

    .line 16
    invoke-interface {v0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setState(I)V

    .line 17
    .line 18
    .line 19
    instance-of p1, v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    move-object p1, v0

    .line 24
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-interface {p1, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setCollectionTime(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->disableTimeoutTimer()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->disableRetransmissionTimer()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :cond_1
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method
