.class public final synthetic La/g79;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j79;


# direct methods
.method public synthetic constructor <init>(La/j79;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g79;->a:B

    iput-object p1, p0, La/g79;->b:La/j79;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g79;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/g79;->b:La/j79;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sget-object v0, La/j79;->O1:La/kl5;

    .line 15
    .line 16
    invoke-virtual {p0}, La/j79;->G0()La/s79;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v0, La/w69;

    .line 21
    .line 22
    invoke-direct {v0, p1}, La/w69;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, La/s79;->N(La/e79;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    sget-object v0, La/j79;->O1:La/kl5;

    .line 38
    .line 39
    invoke-virtual {p0}, La/j79;->G0()La/s79;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, La/v69;

    .line 44
    .line 45
    invoke-direct {v0, p1}, La/v69;-><init>(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, La/s79;->N(La/e79;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
