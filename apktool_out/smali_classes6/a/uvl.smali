.class public final synthetic La/uvl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yvl;


# direct methods
.method public synthetic constructor <init>(La/yvl;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uvl;->a:B

    iput-object p1, p0, La/uvl;->b:La/yvl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/uvl;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/uvl;->b:La/yvl;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/abi0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/yvl;->a:La/evq0;

    .line 14
    .line 15
    sget-object v0, La/evq0;->a:La/evq0;

    .line 16
    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const-string v0, "checked"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "unchecked"

    .line 23
    .line 24
    :goto_0
    invoke-static {p1, v0}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p0}, La/yai0;->i(La/abi0;La/evq0;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, La/uag0;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-boolean p0, p0, La/yvl;->b:Z

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    const/high16 p0, 0x3f800000    # 1.0f

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/high16 p0, 0x3f000000    # 0.5f

    .line 46
    .line 47
    :goto_1
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

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
