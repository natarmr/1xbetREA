.class public Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;


# static fields
.field private static final interceptorCheckpoint:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;


# instance fields
.field private callAnalyzer:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 2
    .line 3
    const-string v1, "ick"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->interceptorCheckpoint:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 9
    .line 10
    return-void
.end method

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
.method public afterMessage(Landroid/javax/sip/message/Message;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->callAnalyzer:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 2
    .line 3
    sget-object p1, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->interceptorCheckpoint:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->leave(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public beforeMessage(Landroid/javax/sip/message/Message;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->callAnalyzer:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 2
    .line 3
    sget-object p1, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->interceptorCheckpoint:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->enter(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->callAnalyzer:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->stop()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->callAnalyzer:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 8
    .line 9
    return-void
.end method

.method public init(Landroid/javax/sip/SipStack;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 2
    .line 3
    check-cast p1, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;-><init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->callAnalyzer:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getConfigurationProperties()Ljava/util/Properties;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-class v0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, ".checkingInterval"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "1000"

    .line 27
    .line 28
    invoke-virtual {p1, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, ".minStuckTIme"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, "4000"

    .line 51
    .line 52
    invoke-virtual {p1, v2, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v3, ".minTimeBetweenDumps"

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v3, "2000"

    .line 75
    .line 76
    invoke-virtual {p1, v0, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 89
    .line 90
    invoke-direct {v0, v1, p1, v2}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->callAnalyzer:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 94
    .line 95
    sget-object p1, Landroid/gov/nist/javax/sip/stack/CallAnalysisInterceptor;->interceptorCheckpoint:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 96
    .line 97
    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->configure(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method
