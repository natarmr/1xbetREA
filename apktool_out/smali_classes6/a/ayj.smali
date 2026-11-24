.class public final synthetic La/ayj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:J

.field public final synthetic f:I

.field public final synthetic g:B

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/ayj;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ayj;->b:La/mm40;

    iput-object p2, p0, La/ayj;->c:Ljava/lang/String;

    iput-object p3, p0, La/ayj;->d:Ljava/lang/String;

    iput-wide p4, p0, La/ayj;->e:J

    iput-object p6, p0, La/ayj;->h:Ljava/lang/Object;

    iput-object p7, p0, La/ayj;->i:Ljava/lang/Object;

    iput p8, p0, La/ayj;->f:I

    iput-byte p9, p0, La/ayj;->g:B

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILa/mm40;La/y9q0;La/y9q0;JI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/ayj;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ayj;->c:Ljava/lang/String;

    iput-object p2, p0, La/ayj;->d:Ljava/lang/String;

    iput-byte p3, p0, La/ayj;->g:B

    iput-object p4, p0, La/ayj;->b:La/mm40;

    iput-object p5, p0, La/ayj;->h:Ljava/lang/Object;

    iput-object p6, p0, La/ayj;->i:Ljava/lang/Object;

    iput-wide p7, p0, La/ayj;->e:J

    iput p9, p0, La/ayj;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ayj;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ayj;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v6, v0

    .line 9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object v0, p0, La/ayj;->i:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v7, v0

    .line 14
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 15
    .line 16
    move-object v8, p1

    .line 17
    check-cast v8, La/fet;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, La/ayj;->f:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    iget-object v1, p0, La/ayj;->b:La/mm40;

    .line 33
    .line 34
    iget-object v2, p0, La/ayj;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v3, p0, La/ayj;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-wide v4, p0, La/ayj;->e:J

    .line 39
    .line 40
    iget-byte v10, p0, La/ayj;->g:B

    .line 41
    .line 42
    invoke-static/range {v1 .. v10}, La/dtb;->m(La/mm40;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    iget-object v0, p0, La/ayj;->h:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v5, v0

    .line 51
    check-cast v5, La/y9q0;

    .line 52
    .line 53
    iget-object v0, p0, La/ayj;->i:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v6, v0

    .line 56
    check-cast v6, La/y9q0;

    .line 57
    .line 58
    move-object v9, p1

    .line 59
    check-cast v9, La/fet;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget p1, p0, La/ayj;->f:I

    .line 67
    .line 68
    or-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    invoke-static {p1}, La/x8x;->L(I)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    iget-object v1, p0, La/ayj;->c:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v2, p0, La/ayj;->d:Ljava/lang/String;

    .line 77
    .line 78
    iget-byte v3, p0, La/ayj;->g:B

    .line 79
    .line 80
    iget-object v4, p0, La/ayj;->b:La/mm40;

    .line 81
    .line 82
    iget-wide v7, p0, La/ayj;->e:J

    .line 83
    .line 84
    invoke-static/range {v1 .. v10}, La/mbc;->k(Ljava/lang/String;Ljava/lang/String;ILa/mm40;La/y9q0;La/y9q0;JLa/fet;I)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
