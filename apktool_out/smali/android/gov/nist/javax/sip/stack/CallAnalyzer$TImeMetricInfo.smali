.class public Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/CallAnalyzer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TImeMetricInfo"
.end annotation


# instance fields
.field public averageTime:Ljava/lang/Long;

.field protected config:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

.field public lastLoggedEventTime:Ljava/lang/Long;

.field public numberOfEvents:Ljava/lang/Long;

.field protected task:Ljava/util/TimerTask;

.field public totalTime:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Long;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->totalTime:Ljava/lang/Long;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->numberOfEvents:Ljava/lang/Long;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/Long;

    .line 21
    .line 22
    const-wide/16 v3, 0x1

    .line 23
    .line 24
    invoke-direct {v0, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->averageTime:Ljava/lang/Long;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->lastLoggedEventTime:Ljava/lang/Long;

    .line 35
    .line 36
    new-instance v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 37
    .line 38
    const/16 v1, 0x1388

    .line 39
    .line 40
    invoke-direct {v0, v1, v1, v1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;-><init>(III)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->config:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 44
    .line 45
    return-void
.end method
