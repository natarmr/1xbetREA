.class public final synthetic La/cic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dic;


# direct methods
.method public synthetic constructor <init>(La/dic;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cic;->a:B

    iput-object p1, p0, La/cic;->b:La/dic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cic;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/cic;->b:La/dic;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/dic;->n2:La/kj5;

    .line 9
    .line 10
    iget-object p0, p0, La/dic;->k2:La/fiu0;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "viewModelFactory"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :pswitch_0
    sget-object v0, La/dic;->n2:La/kj5;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/dic;->n2:La/kj5;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
