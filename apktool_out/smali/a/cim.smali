.class public final synthetic La/cim;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/mm40;

.field public final synthetic d:S

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/e0x;ZLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/cim;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cim;->c:La/mm40;

    iput-object p2, p0, La/cim;->f:Ljava/lang/Object;

    iput-boolean p3, p0, La/cim;->b:Z

    iput-object p4, p0, La/cim;->g:La/wdr;

    iput-short p5, p0, La/cim;->d:S

    iput-byte p6, p0, La/cim;->e:B

    return-void
.end method

.method public synthetic constructor <init>(La/of90;ZLa/mm40;La/xdr;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/cim;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cim;->f:Ljava/lang/Object;

    iput-boolean p2, p0, La/cim;->b:Z

    iput-object p3, p0, La/cim;->c:La/mm40;

    iput-object p4, p0, La/cim;->g:La/wdr;

    iput-short p5, p0, La/cim;->d:S

    iput-byte p6, p0, La/cim;->e:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/cim;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/cim;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, La/of90;

    .line 10
    .line 11
    iget-object v0, p0, La/cim;->g:La/wdr;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, La/xdr;

    .line 15
    .line 16
    move-object v5, p1

    .line 17
    check-cast v5, La/fet;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-short p1, p0, La/cim;->d:S

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    iget-boolean v2, p0, La/cim;->b:Z

    .line 33
    .line 34
    iget-object v3, p0, La/cim;->c:La/mm40;

    .line 35
    .line 36
    iget-byte v7, p0, La/cim;->e:B

    .line 37
    .line 38
    invoke-static/range {v1 .. v7}, La/n2x;->f(La/of90;ZLa/mm40;La/xdr;La/fet;II)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    iget-object v0, p0, La/cim;->f:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v2, v0

    .line 47
    check-cast v2, La/e0x;

    .line 48
    .line 49
    iget-object v0, p0, La/cim;->g:La/wdr;

    .line 50
    .line 51
    move-object v4, v0

    .line 52
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    move-object v5, p1

    .line 55
    check-cast v5, La/fet;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-short p1, p0, La/cim;->d:S

    .line 63
    .line 64
    or-int/lit8 p1, p1, 0x1

    .line 65
    .line 66
    invoke-static {p1}, La/x8x;->L(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    iget-object v1, p0, La/cim;->c:La/mm40;

    .line 71
    .line 72
    iget-boolean v3, p0, La/cim;->b:Z

    .line 73
    .line 74
    iget-byte v7, p0, La/cim;->e:B

    .line 75
    .line 76
    invoke-static/range {v1 .. v7}, La/bkb;->w(La/mm40;La/e0x;ZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
