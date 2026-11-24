.class public abstract La/o7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/mm40;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ahd;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ahd;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/jm40;->b:La/jm40;

    .line 9
    .line 10
    invoke-static {v1, v0}, La/knx;->Q(La/mm40;La/xdr;)La/mm40;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v2, La/b5;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, v3}, La/b5;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3, v2}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/high16 v2, 0x41200000    # 10.0f

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x2

    .line 28
    invoke-static {v0, v2, v4, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 29
    .line 30
    .line 31
    new-instance v0, La/ahd;

    .line 32
    .line 33
    const/16 v6, 0xf

    .line 34
    .line 35
    invoke-direct {v0, v6}, La/ahd;-><init>(B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v0}, La/knx;->Q(La/mm40;La/xdr;)La/mm40;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, La/b5;

    .line 43
    .line 44
    invoke-direct {v1, v5}, La/b5;-><init>(B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v3, v1}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0, v4, v2, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, La/o7;->a:La/mm40;

    .line 56
    .line 57
    return-void
.end method
