.class public final La/oid0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iu5;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final synthetic c:La/qid0;


# direct methods
.method public constructor <init>(La/qid0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/oid0;->c:La/qid0;

    .line 11
    .line 12
    iput-object p2, p0, La/oid0;->a:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, La/oid0;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(La/lu5;)V
    .locals 4

    .line 1
    iget-object p1, p1, La/lu5;->a:La/i0g0;

    .line 2
    .line 3
    sget-object v0, La/qid0;->V1:La/rl70;

    .line 4
    .line 5
    iget-object v0, p0, La/oid0;->c:La/qid0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/qid0;->G0()La/n3r;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, La/n3r;->c:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->d()V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/qid0;->R1:La/n0o0;

    .line 17
    .line 18
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La/kb6;

    .line 23
    .line 24
    invoke-virtual {v1}, La/kb6;->a()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, La/i0g0;->a:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Lkotlin/Pair;

    .line 47
    .line 48
    iget-object v3, p0, La/oid0;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {v2, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object p0, p0, La/oid0;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v1, p1, p0}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, v0, La/qid0;->N1:La/kiu0;

    .line 67
    .line 68
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/sid0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/sid0;->w()V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    return-void
.end method
