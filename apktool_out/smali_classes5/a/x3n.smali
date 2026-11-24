.class public final synthetic La/x3n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:I

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/hh80;La/d9z;ZLkotlin/jvm/functions/Function2;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/x3n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x3n;->b:La/mm40;

    iput-object p2, p0, La/x3n;->f:Ljava/lang/Object;

    iput-object p3, p0, La/x3n;->g:Ljava/lang/Object;

    iput-boolean p4, p0, La/x3n;->c:Z

    iput-object p5, p0, La/x3n;->h:La/wdr;

    iput p6, p0, La/x3n;->d:I

    iput-byte p7, p0, La/x3n;->e:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/x3n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x3n;->b:La/mm40;

    iput-object p2, p0, La/x3n;->f:Ljava/lang/Object;

    iput-boolean p3, p0, La/x3n;->c:Z

    iput-object p4, p0, La/x3n;->g:Ljava/lang/Object;

    iput-object p5, p0, La/x3n;->h:La/wdr;

    iput p6, p0, La/x3n;->d:I

    iput-byte p7, p0, La/x3n;->e:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/x3n;->a:B

    .line 2
    .line 3
    iget v1, p0, La/x3n;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/x3n;->h:La/wdr;

    .line 6
    .line 7
    iget-object v3, p0, La/x3n;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/x3n;->f:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v6, v4

    .line 15
    check-cast v6, La/hh80;

    .line 16
    .line 17
    move-object v7, v3

    .line 18
    check-cast v7, La/d9z;

    .line 19
    .line 20
    move-object v9, v2

    .line 21
    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 22
    .line 23
    move-object v10, p1

    .line 24
    check-cast v10, La/fet;

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    or-int/lit8 p1, v1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    iget-object v5, p0, La/x3n;->b:La/mm40;

    .line 38
    .line 39
    iget-boolean v8, p0, La/x3n;->c:Z

    .line 40
    .line 41
    iget-byte v12, p0, La/x3n;->e:B

    .line 42
    .line 43
    invoke-static/range {v5 .. v12}, La/uzb;->z(La/mm40;La/hh80;La/d9z;ZLkotlin/jvm/functions/Function2;La/fet;II)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    check-cast v4, La/k4n;

    .line 50
    .line 51
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    move-object v5, p1

    .line 56
    check-cast v5, La/fet;

    .line 57
    .line 58
    check-cast p2, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    or-int/lit8 p1, v1, 0x1

    .line 64
    .line 65
    invoke-static {p1}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    iget-object v0, p0, La/x3n;->b:La/mm40;

    .line 70
    .line 71
    move-object v1, v4

    .line 72
    move-object v4, v2

    .line 73
    iget-boolean v2, p0, La/x3n;->c:Z

    .line 74
    .line 75
    iget-byte v7, p0, La/x3n;->e:B

    .line 76
    .line 77
    invoke-static/range {v0 .. v7}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
