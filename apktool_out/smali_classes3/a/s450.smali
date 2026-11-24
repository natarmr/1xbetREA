.class public final La/s450;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/tf40;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/tf40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s450;->a:B

    iput-object p1, p0, La/s450;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/s450;->c:La/tf40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/s450;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/s450;->c:La/tf40;

    .line 4
    .line 5
    iget-object p0, p0, La/s450;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/st0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/a450;

    .line 16
    .line 17
    iget-wide v2, p1, La/st0;->a:J

    .line 18
    .line 19
    check-cast v1, La/hf40;

    .line 20
    .line 21
    iget-object p1, v1, La/hf40;->a:La/x4t;

    .line 22
    .line 23
    invoke-direct {v0, v2, v3, p1}, La/a450;-><init>(JLa/x4t;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    check-cast p1, La/st0;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v0, La/z350;

    .line 38
    .line 39
    iget-wide v2, p1, La/st0;->a:J

    .line 40
    .line 41
    iget-object p1, p1, La/st0;->d:La/mtr;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    iget-boolean p1, p1, La/mtr;->b:Z

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    :goto_0
    check-cast v1, La/hf40;

    .line 50
    .line 51
    iget-object v1, v1, La/hf40;->a:La/x4t;

    .line 52
    .line 53
    invoke-direct {v0, v2, v3, p1, v1}, La/z350;-><init>(JZLa/x4t;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
