.class public final synthetic La/zbm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/fcm;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/fcm;ZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/zbm;->a:B

    iput-object p1, p0, La/zbm;->b:La/mm40;

    iput-object p2, p0, La/zbm;->c:La/fcm;

    iput-boolean p3, p0, La/zbm;->d:Z

    iput-object p4, p0, La/zbm;->e:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/zbm;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/zbm;->a:B

    .line 2
    .line 3
    iget v1, p0, La/zbm;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v6, p1

    .line 9
    check-cast v6, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    iget-object v2, p0, La/zbm;->b:La/mm40;

    .line 23
    .line 24
    iget-object v3, p0, La/zbm;->c:La/fcm;

    .line 25
    .line 26
    iget-boolean v4, p0, La/zbm;->d:Z

    .line 27
    .line 28
    iget-object v5, p0, La/zbm;->e:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    invoke-static/range {v2 .. v7}, La/xbc;->e(La/mm40;La/fcm;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v4, p1

    .line 37
    check-cast v4, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    or-int/lit8 p1, v1, 0x1

    .line 45
    .line 46
    invoke-static {p1}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget-object v0, p0, La/zbm;->b:La/mm40;

    .line 51
    .line 52
    iget-object v1, p0, La/zbm;->c:La/fcm;

    .line 53
    .line 54
    iget-boolean v2, p0, La/zbm;->d:Z

    .line 55
    .line 56
    iget-object v3, p0, La/zbm;->e:Lkotlin/jvm/functions/Function1;

    .line 57
    .line 58
    invoke-static/range {v0 .. v5}, La/xbc;->e(La/mm40;La/fcm;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
