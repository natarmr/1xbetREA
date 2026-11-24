.class public abstract La/rlx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/ykw;

.field public static final b:La/gcu0;

.field public static final c:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ykw;

    .line 2
    .line 3
    sget-object v1, La/qlx;->a:La/qlx;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/w12;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/rlx;->a:La/ykw;

    .line 9
    .line 10
    new-instance v0, La/gcu0;

    .line 11
    .line 12
    sget-object v1, La/plx;->a:La/plx;

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/w12;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/rlx;->b:La/gcu0;

    .line 18
    .line 19
    new-instance v0, La/zxb;

    .line 20
    .line 21
    const/16 v1, 0x1c

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/zxb;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 27
    .line 28
    .line 29
    new-instance v0, La/qgx;

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    invoke-direct {v0, v1}, La/qgx;-><init>(B)V

    .line 33
    .line 34
    .line 35
    new-instance v1, La/zfn;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 39
    .line 40
    .line 41
    sput-object v1, La/rlx;->c:La/zfn;

    .line 42
    .line 43
    return-void
.end method
