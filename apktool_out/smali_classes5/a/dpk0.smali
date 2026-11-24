.class public final synthetic La/dpk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fpk0;


# direct methods
.method public synthetic constructor <init>(La/fpk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dpk0;->a:B

    iput-object p1, p0, La/dpk0;->b:La/fpk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dpk0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/dpk0;->b:La/fpk0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sget-object v0, La/fpk0;->V1:La/zie0;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/fpk0;->I0()La/k3t0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, La/vok0;->a:La/vok0;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    sget-object v0, La/fpk0;->V1:La/zie0;

    .line 37
    .line 38
    invoke-virtual {p0}, La/fpk0;->I0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v0, La/yok0;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/yok0;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
