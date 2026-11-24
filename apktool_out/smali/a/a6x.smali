.class public abstract La/a6x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/kdw;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/kdw;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/a6x;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/gy40;La/d6x;)La/mm40;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, La/b6x;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, La/b6x;-><init>(La/gy40;La/d6x;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
