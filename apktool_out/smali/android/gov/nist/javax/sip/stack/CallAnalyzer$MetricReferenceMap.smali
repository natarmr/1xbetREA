.class public Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;
.super Ljava/util/WeakHashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/CallAnalyzer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MetricReferenceMap"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/WeakHashMap<",
        "Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;",
        "Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x5750a10b481789cL


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/WeakHashMap;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 9
    .line 10
    new-instance v1, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-super {p0, v0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 23
    .line 24
    return-object p0
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    move-result-object p0

    return-object p0
.end method
