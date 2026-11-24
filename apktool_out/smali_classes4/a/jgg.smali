.class public abstract La/jgg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;

.field public static final b:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/jcg;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/jcg;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/jgg;->a:La/zfn;

    .line 15
    .line 16
    new-instance v0, La/jcg;

    .line 17
    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/jcg;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, La/zfn;

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 26
    .line 27
    .line 28
    sput-object v1, La/jgg;->b:La/zfn;

    .line 29
    .line 30
    return-void
.end method
