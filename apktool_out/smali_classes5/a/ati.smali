.class public final La/ati;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/fri;


# direct methods
.method public constructor <init>(La/fri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ati;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 4

    .line 1
    new-instance v0, La/f4i0;

    .line 2
    .line 3
    iget-object p0, p0, La/ati;->a:La/fri;

    .line 4
    .line 5
    iget-object p0, p0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/bti;

    .line 8
    .line 9
    iget-object v1, p0, La/bti;->a:La/mne;

    .line 10
    .line 11
    iget-object p0, p0, La/bti;->b:Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 12
    .line 13
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 14
    .line 15
    invoke-static {v1, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, La/x6h0;

    .line 20
    .line 21
    const/16 v3, 0xb

    .line 22
    .line 23
    invoke-direct {v2, p1, p0, v3}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/eoh0;

    .line 27
    .line 28
    const/16 p1, 0xd

    .line 29
    .line 30
    invoke-direct {p0, p1}, La/eoh0;-><init>(B)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-direct {v0, v2, v1, p0, p1}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method
