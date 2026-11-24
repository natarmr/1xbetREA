.class public final synthetic La/s6m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:F

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(BFILa/mm40;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/s6m;->a:B

    packed-switch p1, :pswitch_data_0

    sget-object p1, La/u6m;->a:La/u6m;

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, La/s6m;->b:La/mm40;

    iput-object p5, p0, La/s6m;->c:Ljava/lang/String;

    iput-boolean p6, p0, La/s6m;->d:Z

    iput p2, p0, La/s6m;->e:F

    iput p3, p0, La/s6m;->f:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/s6m;->a:B

    .line 2
    .line 3
    iget v1, p0, La/s6m;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v4, p1

    .line 9
    check-cast v4, La/fet;

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
    move-result v3

    .line 22
    iget v2, p0, La/s6m;->e:F

    .line 23
    .line 24
    iget-object v5, p0, La/s6m;->b:La/mm40;

    .line 25
    .line 26
    iget-object v6, p0, La/s6m;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-boolean v7, p0, La/s6m;->d:Z

    .line 29
    .line 30
    invoke-static/range {v2 .. v7}, La/mbc;->J(FILa/fet;La/mm40;Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    sget-object v0, La/u6m;->a:La/u6m;

    .line 37
    .line 38
    move-object v4, p1

    .line 39
    check-cast v4, La/fet;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    or-int/lit8 p1, v1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget v2, p0, La/s6m;->e:F

    .line 53
    .line 54
    iget-object v5, p0, La/s6m;->b:La/mm40;

    .line 55
    .line 56
    iget-object v6, p0, La/s6m;->c:Ljava/lang/String;

    .line 57
    .line 58
    iget-boolean v7, p0, La/s6m;->d:Z

    .line 59
    .line 60
    invoke-static/range {v2 .. v7}, La/oja0;->B(FILa/fet;La/mm40;Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
