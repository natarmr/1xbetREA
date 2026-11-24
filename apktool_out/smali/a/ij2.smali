.class public final synthetic La/ij2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/bdz;

.field public final synthetic d:Z

.field public final synthetic e:La/a4x;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/bdz;ZLa/a4x;ZZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/ij2;->a:B

    iput-object p1, p0, La/ij2;->b:La/mm40;

    iput-object p2, p0, La/ij2;->c:La/bdz;

    iput-boolean p3, p0, La/ij2;->d:Z

    iput-object p4, p0, La/ij2;->e:La/a4x;

    iput-boolean p5, p0, La/ij2;->f:Z

    iput-boolean p6, p0, La/ij2;->g:Z

    iput-object p7, p0, La/ij2;->h:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La/ij2;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ij2;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, La/ij2;->i:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    iget-object v1, p0, La/ij2;->b:La/mm40;

    .line 23
    .line 24
    iget-object v2, p0, La/ij2;->c:La/bdz;

    .line 25
    .line 26
    iget-boolean v3, p0, La/ij2;->d:Z

    .line 27
    .line 28
    iget-object v4, p0, La/ij2;->e:La/a4x;

    .line 29
    .line 30
    iget-boolean v5, p0, La/ij2;->f:Z

    .line 31
    .line 32
    iget-boolean v6, p0, La/ij2;->g:Z

    .line 33
    .line 34
    iget-object v7, p0, La/ij2;->h:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-static/range {v1 .. v9}, La/hmw0;->G(La/mm40;La/bdz;ZLa/a4x;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    move-object v7, p1

    .line 43
    check-cast v7, La/fet;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget p1, p0, La/ij2;->i:I

    .line 51
    .line 52
    or-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    invoke-static {p1}, La/x8x;->L(I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    iget-object v0, p0, La/ij2;->b:La/mm40;

    .line 59
    .line 60
    iget-object v1, p0, La/ij2;->c:La/bdz;

    .line 61
    .line 62
    iget-boolean v2, p0, La/ij2;->d:Z

    .line 63
    .line 64
    iget-object v3, p0, La/ij2;->e:La/a4x;

    .line 65
    .line 66
    iget-boolean v4, p0, La/ij2;->f:Z

    .line 67
    .line 68
    iget-boolean v5, p0, La/ij2;->g:Z

    .line 69
    .line 70
    iget-object v6, p0, La/ij2;->h:Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    invoke-static/range {v0 .. v8}, La/epv0;->w(La/mm40;La/bdz;ZLa/a4x;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

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
