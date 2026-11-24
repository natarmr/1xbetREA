.class public final La/wq1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/vq1;


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:La/xp1;

.field public final c:La/zq1;

.field public final d:La/rq1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/vq1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wq1;->Companion:La/vq1;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Long;La/xp1;La/zq1;La/rq1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, La/wq1;->a:Ljava/lang/Long;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/wq1;->a:Ljava/lang/Long;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    new-instance p2, La/xp1;

    .line 19
    .line 20
    invoke-direct {p2}, La/xp1;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, La/wq1;->b:La/xp1;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iput-object p3, p0, La/wq1;->b:La/xp1;

    .line 27
    .line 28
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 29
    .line 30
    if-nez p2, :cond_2

    .line 31
    .line 32
    new-instance p2, La/zq1;

    .line 33
    .line 34
    invoke-direct {p2}, La/zq1;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, La/wq1;->c:La/zq1;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iput-object p4, p0, La/wq1;->c:La/zq1;

    .line 41
    .line 42
    :goto_2
    and-int/lit8 p1, p1, 0x8

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iput-object v1, p0, La/wq1;->d:La/rq1;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    iput-object p5, p0, La/wq1;->d:La/rq1;

    .line 50
    .line 51
    return-void
.end method
