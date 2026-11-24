.class public final La/aqp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fix;

.field public final b:La/gst0;

.field public final c:La/rou;

.field public final d:La/ieu;

.field public final e:La/uzc;


# direct methods
.method public constructor <init>(La/fix;La/gst0;La/rou;La/ieu;La/uzc;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/aqp;->a:La/fix;

    .line 11
    .line 12
    iput-object p2, p0, La/aqp;->b:La/gst0;

    .line 13
    .line 14
    iput-object p3, p0, La/aqp;->c:La/rou;

    .line 15
    .line 16
    iput-object p4, p0, La/aqp;->d:La/ieu;

    .line 17
    .line 18
    iput-object p5, p0, La/aqp;->e:La/uzc;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(JJLa/bnn0;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, La/ypp;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v2, p1

    .line 6
    move-wide v4, p3

    .line 7
    invoke-direct/range {v0 .. v6}, La/ypp;-><init>(La/aqp;JJLa/yje;)V

    .line 8
    .line 9
    .line 10
    const-wide/16 p0, 0x1e

    .line 11
    .line 12
    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    invoke-static {p0, p1, p2, v0}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, La/zpp;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-direct {p1, v1, p2}, La/zpp;-><init>(La/aqp;La/yje;)V

    .line 22
    .line 23
    .line 24
    new-instance p2, La/a1g;

    .line 25
    .line 26
    const/16 p3, 0x14

    .line 27
    .line 28
    invoke-direct {p2, p0, p1, p3}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2, p5}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/wne;->a:La/wne;

    .line 36
    .line 37
    if-ne p0, p1, :cond_0

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
