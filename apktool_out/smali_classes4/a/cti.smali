.class public final La/cti;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/msi;


# direct methods
.method public constructor <init>(La/msi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cti;->a:La/msi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 5

    .line 1
    new-instance v0, La/p3i0;

    .line 2
    .line 3
    iget-object p0, p0, La/cti;->a:La/msi;

    .line 4
    .line 5
    iget-object p0, p0, La/msi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/dti;

    .line 8
    .line 9
    iget-object v1, p0, La/dti;->a:Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 10
    .line 11
    iget-object v2, p0, La/dti;->b:La/cad;

    .line 12
    .line 13
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, La/psc;

    .line 16
    .line 17
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, La/sqt;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/dti;->c:La/ctf0;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v4, La/gwg0;

    .line 35
    .line 36
    invoke-direct {v4, v1, v3}, La/gwg0;-><init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;La/sqt;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, La/iv80;

    .line 40
    .line 41
    const/16 v3, 0x1c

    .line 42
    .line 43
    invoke-direct {v1, p0, v3}, La/iv80;-><init>(La/ctf0;B)V

    .line 44
    .line 45
    .line 46
    iget-object p0, v2, La/mne;->a:La/rwj;

    .line 47
    .line 48
    invoke-static {p0, p0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p1, v4, v1, p0}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/g090;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method
