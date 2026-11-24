.class public final synthetic La/u05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w6k;


# direct methods
.method public synthetic constructor <init>(La/w6k;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u05;->a:B

    iput-object p1, p0, La/u05;->b:La/w6k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u05;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x42200000    # 40.0f

    .line 4
    .line 5
    iget-object p0, p0, La/u05;->b:La/w6k;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object p1, La/qmk;->a:La/zcl;

    .line 16
    .line 17
    invoke-interface {p0, v1}, La/w6k;->T(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object p1, La/qmk;->a:La/zcl;

    .line 30
    .line 31
    invoke-interface {p0, v1}, La/w6k;->T(F)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    goto :goto_0

    .line 36
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-interface {p0, p1}, La/w6k;->z(I)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    new-instance v0, La/daq0;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1}, La/daq0;-><init>(J)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
