.class public final synthetic La/w5m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a6m;ZFFI)V
    .locals 0

    .line 1
    const/4 p6, 0x0

    iput-byte p6, p0, La/w5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w5m;->e:Ljava/lang/Object;

    iput-object p2, p0, La/w5m;->f:Ljava/lang/Object;

    iput-boolean p3, p0, La/w5m;->d:Z

    iput p4, p0, La/w5m;->b:F

    iput p5, p0, La/w5m;->c:F

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/prm;FFZ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/w5m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w5m;->e:Ljava/lang/Object;

    iput-object p2, p0, La/w5m;->f:Ljava/lang/Object;

    iput p3, p0, La/w5m;->b:F

    iput p4, p0, La/w5m;->c:F

    iput-boolean p5, p0, La/w5m;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/w5m;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/w5m;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/w5m;->e:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    check-cast v1, La/prm;

    .line 13
    .line 14
    check-cast p1, La/dpa0;

    .line 15
    .line 16
    check-cast p2, La/ne60;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-wide v3, p1, La/dpa0;->c:J

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v7, v1, La/prm;->d:La/a4x;

    .line 27
    .line 28
    iget v5, p0, La/w5m;->b:F

    .line 29
    .line 30
    iget v6, p0, La/w5m;->c:F

    .line 31
    .line 32
    iget-boolean v8, p0, La/w5m;->d:Z

    .line 33
    .line 34
    invoke-static/range {v3 .. v8}, La/qcc;->N(JFFLa/a4x;Z)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    move-object v0, v2

    .line 49
    check-cast v0, La/mm40;

    .line 50
    .line 51
    check-cast v1, La/a6m;

    .line 52
    .line 53
    move-object v5, p1

    .line 54
    check-cast v5, La/fet;

    .line 55
    .line 56
    check-cast p2, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    invoke-static {p1}, La/x8x;->L(I)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    iget-boolean v2, p0, La/w5m;->d:Z

    .line 67
    .line 68
    iget v3, p0, La/w5m;->b:F

    .line 69
    .line 70
    iget v4, p0, La/w5m;->c:F

    .line 71
    .line 72
    invoke-static/range {v0 .. v6}, La/gkb;->E(La/mm40;La/a6m;ZFFLa/fet;I)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
