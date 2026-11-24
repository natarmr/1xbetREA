.class public final La/tt9;
.super La/po8;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/ut9;


# direct methods
.method public constructor <init>(La/ut9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tt9;->a:La/ut9;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;F)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    cmpg-float p1, p2, p1

    .line 3
    .line 4
    if-gez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, La/ut9;->s2:La/bj5;

    .line 7
    .line 8
    iget-object p0, p0, La/tt9;->a:La/ut9;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ut9;->P0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object p2, La/pt9;->a:La/pt9;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 p2, 0x3

    .line 24
    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 33
    .line 34
    :cond_0
    return-void
.end method
