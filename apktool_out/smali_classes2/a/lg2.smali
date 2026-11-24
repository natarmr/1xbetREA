.class public final synthetic La/lg2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:La/bdz;

.field public final synthetic e:Z

.field public final synthetic f:La/bzl;

.field public final synthetic g:La/a4x;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(La/mm40;FLa/bdz;La/bzl;La/a4x;ZZZLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/lg2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lg2;->b:La/mm40;

    iput p2, p0, La/lg2;->c:F

    iput-object p3, p0, La/lg2;->d:La/bdz;

    iput-object p4, p0, La/lg2;->f:La/bzl;

    iput-object p5, p0, La/lg2;->g:La/a4x;

    iput-boolean p6, p0, La/lg2;->e:Z

    iput-boolean p7, p0, La/lg2;->h:Z

    iput-boolean p8, p0, La/lg2;->i:Z

    iput-object p9, p0, La/lg2;->j:Lkotlin/jvm/functions/Function1;

    iput p10, p0, La/lg2;->k:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;FLa/bdz;ZLa/bzl;La/a4x;ZZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p11, p0, La/lg2;->a:B

    iput-object p1, p0, La/lg2;->b:La/mm40;

    iput p2, p0, La/lg2;->c:F

    iput-object p3, p0, La/lg2;->d:La/bdz;

    iput-boolean p4, p0, La/lg2;->e:Z

    iput-object p5, p0, La/lg2;->f:La/bzl;

    iput-object p6, p0, La/lg2;->g:La/a4x;

    iput-boolean p7, p0, La/lg2;->h:Z

    iput-boolean p8, p0, La/lg2;->i:Z

    iput-object p9, p0, La/lg2;->j:Lkotlin/jvm/functions/Function1;

    iput p10, p0, La/lg2;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/lg2;->a:B

    .line 2
    .line 3
    iget v1, p0, La/lg2;->k:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v5, p1

    .line 9
    check-cast v5, La/fet;

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
    iget v2, p0, La/lg2;->c:F

    .line 23
    .line 24
    iget-object v4, p0, La/lg2;->f:La/bzl;

    .line 25
    .line 26
    iget-object v6, p0, La/lg2;->g:La/a4x;

    .line 27
    .line 28
    iget-object v7, p0, La/lg2;->d:La/bdz;

    .line 29
    .line 30
    iget-object v8, p0, La/lg2;->b:La/mm40;

    .line 31
    .line 32
    iget-object v9, p0, La/lg2;->j:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    iget-boolean v10, p0, La/lg2;->e:Z

    .line 35
    .line 36
    iget-boolean v11, p0, La/lg2;->h:Z

    .line 37
    .line 38
    iget-boolean v12, p0, La/lg2;->i:Z

    .line 39
    .line 40
    invoke-static/range {v2 .. v12}, La/i4w0;->w(FILa/bzl;La/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;ZZZ)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    move-object v3, p1

    .line 47
    check-cast v3, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    or-int/lit8 p1, v1, 0x1

    .line 55
    .line 56
    invoke-static {p1}, La/x8x;->L(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget v0, p0, La/lg2;->c:F

    .line 61
    .line 62
    iget-object v2, p0, La/lg2;->f:La/bzl;

    .line 63
    .line 64
    iget-object v4, p0, La/lg2;->g:La/a4x;

    .line 65
    .line 66
    iget-object v5, p0, La/lg2;->d:La/bdz;

    .line 67
    .line 68
    iget-object v6, p0, La/lg2;->b:La/mm40;

    .line 69
    .line 70
    iget-object v7, p0, La/lg2;->j:Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    iget-boolean v8, p0, La/lg2;->e:Z

    .line 73
    .line 74
    iget-boolean v9, p0, La/lg2;->h:Z

    .line 75
    .line 76
    iget-boolean v10, p0, La/lg2;->i:Z

    .line 77
    .line 78
    invoke-static/range {v0 .. v10}, La/phu0;->q(FILa/bzl;La/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;ZZZ)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    move-object v3, p1

    .line 85
    check-cast v3, La/fet;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    or-int/lit8 p1, v1, 0x1

    .line 93
    .line 94
    invoke-static {p1}, La/x8x;->L(I)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iget v0, p0, La/lg2;->c:F

    .line 99
    .line 100
    iget-object v2, p0, La/lg2;->f:La/bzl;

    .line 101
    .line 102
    iget-object v4, p0, La/lg2;->g:La/a4x;

    .line 103
    .line 104
    iget-object v5, p0, La/lg2;->d:La/bdz;

    .line 105
    .line 106
    iget-object v6, p0, La/lg2;->b:La/mm40;

    .line 107
    .line 108
    iget-object v7, p0, La/lg2;->j:Lkotlin/jvm/functions/Function1;

    .line 109
    .line 110
    iget-boolean v8, p0, La/lg2;->e:Z

    .line 111
    .line 112
    iget-boolean v9, p0, La/lg2;->h:Z

    .line 113
    .line 114
    iget-boolean v10, p0, La/lg2;->i:Z

    .line 115
    .line 116
    invoke-static/range {v0 .. v10}, La/f1t0;->x(FILa/bzl;La/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;ZZZ)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
