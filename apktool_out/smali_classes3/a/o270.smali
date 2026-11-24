.class public final synthetic La/o270;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gxu;


# direct methods
.method public synthetic constructor <init>(La/gxu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o270;->a:B

    iput-object p1, p0, La/o270;->b:La/gxu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/o270;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/o270;->b:La/gxu;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/gxu;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/gii0;

    .line 11
    .line 12
    const-class v0, La/is60;

    .line 13
    .line 14
    sget-object v1, La/sre0;->a:La/tre0;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/is60;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    iget-object p0, p0, La/gxu;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/gii0;

    .line 30
    .line 31
    const-class v0, La/nz60;

    .line 32
    .line 33
    sget-object v1, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/nz60;

    .line 44
    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
