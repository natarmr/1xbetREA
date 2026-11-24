.class public final La/xc00;
.super La/zkd;
.source "SourceFile"


# instance fields
.field public final f:La/a8z;


# direct methods
.method public constructor <init>(La/ar20;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, La/zkd;-><init>(La/ar20;Ljava/util/List;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/wez;->b:La/wez;

    .line 8
    .line 9
    new-instance p2, La/sz2;

    .line 10
    .line 11
    const/16 v0, 0xf

    .line 12
    .line 13
    invoke-direct {p2, p0, v0}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/xc00;->f:La/a8z;

    .line 21
    .line 22
    return-void
.end method
