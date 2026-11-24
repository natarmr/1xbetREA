.class public final La/wa4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/u8i;

.field public final synthetic k:Landroidx/fragment/app/Fragment;

.field public final synthetic l:I

.field public final synthetic m:Landroid/view/ViewGroup;

.field public final synthetic n:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/u8i;Landroidx/fragment/app/Fragment;ILandroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wa4;->j:La/u8i;

    .line 2
    .line 3
    iput-object p2, p0, La/wa4;->k:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    iput p3, p0, La/wa4;->l:I

    .line 6
    .line 7
    iput-object p4, p0, La/wa4;->m:Landroid/view/ViewGroup;

    .line 8
    .line 9
    iput-object p5, p0, La/wa4;->n:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/wa4;

    .line 2
    .line 3
    iget-object v4, p0, La/wa4;->m:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v5, p0, La/wa4;->n:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v1, p0, La/wa4;->j:La/u8i;

    .line 8
    .line 9
    iget-object v2, p0, La/wa4;->k:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    iget v3, p0, La/wa4;->l:I

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/wa4;-><init>(La/u8i;Landroidx/fragment/app/Fragment;ILandroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/wa4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/wa4;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/wa4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/wa4;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/wa4;->j:La/u8i;

    .line 25
    .line 26
    iget-object v3, p1, La/u8i;->J:La/kd30;

    .line 27
    .line 28
    new-instance v7, La/wc2;

    .line 29
    .line 30
    const/16 p1, 0x9

    .line 31
    .line 32
    iget-object v1, p0, La/wa4;->n:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    invoke-direct {v7, v1, p1}, La/wc2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 35
    .line 36
    .line 37
    new-instance v8, La/zk2;

    .line 38
    .line 39
    const/16 p1, 0x19

    .line 40
    .line 41
    invoke-direct {v8, v1, p1}, La/zk2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 42
    .line 43
    .line 44
    new-instance v9, La/zk2;

    .line 45
    .line 46
    const/16 p1, 0x1a

    .line 47
    .line 48
    invoke-direct {v9, v1, p1}, La/zk2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 49
    .line 50
    .line 51
    iput-boolean v2, p0, La/wa4;->i:Z

    .line 52
    .line 53
    iget-object v4, p0, La/wa4;->k:Landroidx/fragment/app/Fragment;

    .line 54
    .line 55
    iget v5, p0, La/wa4;->l:I

    .line 56
    .line 57
    iget-object v6, p0, La/wa4;->m:Landroid/view/ViewGroup;

    .line 58
    .line 59
    move-object v10, p0

    .line 60
    invoke-virtual/range {v3 .. v10}, La/kd30;->O(Landroidx/fragment/app/Fragment;ILandroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v0, :cond_2

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0
.end method
