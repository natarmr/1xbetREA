.class final Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->main([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$sec:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

.field final synthetic val$tp:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$tp:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$sec:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    const-string v0, "Avg "

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$tp:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 4
    .line 5
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$sec:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->enter(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    sget v1, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->count:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    sput v1, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->count:I

    .line 15
    .line 16
    rem-int/lit16 v1, v1, 0x2710

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$tp:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 28
    .line 29
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$sec:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getMetricStats(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->averageTime:Ljava/lang/Long;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v0, 0x3e8

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :goto_0
    const-wide/16 v0, 0x64

    .line 56
    .line 57
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 62
    .line 63
    .line 64
    :goto_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$tp:Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 65
    .line 66
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;->val$sec:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->leave(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
