.class public final La/lqd;
.super Landroidx/compose/runtime/d;
.source "SourceFile"


# instance fields
.field public final b:La/mqd;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    new-instance v0, La/yld;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/yld;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/compose/runtime/d;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, La/mqd;

    .line 12
    .line 13
    invoke-direct {v0, p1}, La/mqd;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/lqd;->b:La/mqd;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b()La/f3u0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lqd;->b:La/mqd;

    .line 2
    .line 3
    return-object p0
.end method
