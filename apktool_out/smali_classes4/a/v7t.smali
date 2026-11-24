.class public final synthetic La/v7t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b8t;


# direct methods
.method public synthetic constructor <init>(La/b8t;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v7t;->a:B

    iput-object p1, p0, La/v7t;->b:La/b8t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v7t;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/v7t;->b:La/b8t;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/b8t;->Q1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/a9t;->t:La/p7m0;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, La/h8t;->a:La/h8t;

    .line 21
    .line 22
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    sget-object v0, La/b8t;->Q1:[La/iiy;

    .line 29
    .line 30
    new-instance v0, La/z7t;

    .line 31
    .line 32
    invoke-direct {v0, p0}, La/z7t;-><init>(La/b8t;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    sget-object v0, La/b8t;->Q1:[La/iiy;

    .line 37
    .line 38
    iget-object p0, p0, La/b8t;->M1:La/fiu0;

    .line 39
    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    const-string p0, "viewModelFactory"

    .line 44
    .line 45
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
