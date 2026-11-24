.class public final synthetic La/ru5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iu5;


# instance fields
.field public final synthetic a:La/tu5;


# direct methods
.method public synthetic constructor <init>(La/tu5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ru5;->a:La/tu5;

    return-void
.end method


# virtual methods
.method public final b(La/lu5;)V
    .locals 4

    .line 1
    sget-object v0, La/tu5;->V1:La/yk5;

    .line 2
    .line 3
    iget-object p0, p0, La/ru5;->a:La/tu5;

    .line 4
    .line 5
    invoke-virtual {p0}, La/tu5;->G0()La/iyq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/iyq;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->d()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/tu5;->R1:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/kb6;

    .line 21
    .line 22
    invoke-virtual {v0}, La/kb6;->a()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, La/lu5;->a:La/i0g0;

    .line 26
    .line 27
    iget-object v0, p1, La/i0g0;->a:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, La/tu5;->P1:La/phf0;

    .line 39
    .line 40
    sget-object v1, La/tu5;->W1:[La/iiy;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    aget-object v2, v1, v2

    .line 44
    .line 45
    invoke-virtual {v0, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v2, p0, La/tu5;->Q1:La/phf0;

    .line 50
    .line 51
    const/4 v3, 0x2

    .line 52
    aget-object v1, v1, v3

    .line 53
    .line 54
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object p1, p1, La/i0g0;->a:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v2, Lkotlin/Pair;

    .line 61
    .line 62
    invoke-direct {v2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, La/tu5;->H0()La/wu5;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, La/wu5;->w()V

    .line 81
    .line 82
    .line 83
    :cond_1
    :goto_0
    return-void
.end method
