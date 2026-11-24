.class public abstract La/u55;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;

.field public static final b:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/a04;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/a04;-><init>(B)V

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
    sput-object v1, La/u55;->a:La/zfn;

    .line 15
    .line 16
    sget-object v0, La/t55;->b:La/t55;

    .line 17
    .line 18
    new-instance v1, La/zfn;

    .line 19
    .line 20
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/u55;->b:La/zfn;

    .line 24
    .line 25
    return-void
.end method
