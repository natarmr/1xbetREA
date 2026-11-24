.class public final La/rbq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/qbq;

.field public static final d:[La/a8z;


# instance fields
.field public final a:La/ecq;

.field public final b:La/ncq;

.field public final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/qbq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/rbq;->Companion:La/qbq;

    .line 7
    .line 8
    sget-object v0, La/ncq;->Companion:La/mcq;

    .line 9
    .line 10
    sget-object v0, La/ecq;->Companion:La/dcq;

    .line 11
    .line 12
    sget-object v0, La/wez;->a:La/wez;

    .line 13
    .line 14
    new-instance v1, La/v9q;

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-direct {v1, v2}, La/v9q;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-array v1, v2, [La/a8z;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    aput-object v3, v1, v2

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object v3, v1, v2

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    aput-object v0, v1, v2

    .line 35
    .line 36
    sput-object v1, La/rbq;->d:[La/a8z;

    .line 37
    .line 38
    return-void
.end method

.method public synthetic constructor <init>(ILa/ecq;La/ncq;Ljava/util/List;)V
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
    iput-object v1, p0, La/rbq;->a:La/ecq;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/rbq;->a:La/ecq;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, La/rbq;->b:La/ncq;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iput-object p3, p0, La/rbq;->b:La/ncq;

    .line 22
    .line 23
    :goto_1
    and-int/lit8 p1, p1, 0x4

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    iput-object v1, p0, La/rbq;->c:Ljava/util/List;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    iput-object p4, p0, La/rbq;->c:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method
