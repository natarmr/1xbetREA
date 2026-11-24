.class public final La/wtc0;
.super La/xhe0;
.source "SourceFile"


# instance fields
.field public final u:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/ssa0;

    .line 8
    .line 9
    const/16 v1, 0x1c

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/wtc0;->u:La/n0o0;

    .line 19
    .line 20
    return-void
.end method
