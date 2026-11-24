.class public final La/ncq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/mcq;

.field public static final e:[La/a8z;


# instance fields
.field public final a:Ljava/lang/Float;

.field public final b:Ljava/util/List;

.field public final c:La/jcq;

.field public final d:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/mcq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ncq;->Companion:La/mcq;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/v9q;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v1, v2}, La/v9q;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x4

    .line 21
    new-array v1, v1, [La/a8z;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    aput-object v3, v1, v2

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    aput-object v0, v1, v2

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    aput-object v3, v1, v0

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    aput-object v3, v1, v0

    .line 35
    .line 36
    sput-object v1, La/ncq;->e:[La/a8z;

    .line 37
    .line 38
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Float;Ljava/util/List;La/jcq;Ljava/lang/Boolean;)V
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
    iput-object v1, p0, La/ncq;->a:Ljava/lang/Float;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/ncq;->a:Ljava/lang/Float;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, La/ncq;->b:Ljava/util/List;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iput-object p3, p0, La/ncq;->b:Ljava/util/List;

    .line 22
    .line 23
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 24
    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    iput-object v1, p0, La/ncq;->c:La/jcq;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    iput-object p4, p0, La/ncq;->c:La/jcq;

    .line 31
    .line 32
    :goto_2
    and-int/lit8 p1, p1, 0x8

    .line 33
    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    iput-object v1, p0, La/ncq;->d:Ljava/lang/Boolean;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    iput-object p5, p0, La/ncq;->d:Ljava/lang/Boolean;

    .line 40
    .line 41
    return-void
.end method
