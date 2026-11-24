.class public Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/CallAnalyzer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MetricAnalysisConfiguration"
.end annotation


# instance fields
.field protected checkingInterval:Ljava/lang/Long;

.field protected minimumDumpInterval:Ljava/lang/Long;

.field protected stuckTimeBeforeDump:Ljava/lang/Long;


# direct methods
.method public constructor <init>(III)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Long;

    .line 5
    .line 6
    int-to-long v1, p1

    .line 7
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->checkingInterval:Ljava/lang/Long;

    .line 11
    .line 12
    new-instance p1, Ljava/lang/Long;

    .line 13
    .line 14
    int-to-long v0, p2

    .line 15
    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->minimumDumpInterval:Ljava/lang/Long;

    .line 19
    .line 20
    new-instance p1, Ljava/lang/Long;

    .line 21
    .line 22
    int-to-long p2, p3

    .line 23
    invoke-direct {p1, p2, p3}, Ljava/lang/Long;-><init>(J)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->stuckTimeBeforeDump:Ljava/lang/Long;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->checkingInterval:Ljava/lang/Long;

    .line 31
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->minimumDumpInterval:Ljava/lang/Long;

    .line 32
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->stuckTimeBeforeDump:Ljava/lang/Long;

    return-void
.end method
