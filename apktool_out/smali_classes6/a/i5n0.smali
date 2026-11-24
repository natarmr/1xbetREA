.class public final synthetic La/i5n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:B

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/Enum;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/Enum;JIIB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/i5n0;->a:B

    iput-object p1, p0, La/i5n0;->b:La/mm40;

    iput-object p2, p0, La/i5n0;->c:Ljava/lang/String;

    iput-object p3, p0, La/i5n0;->g:Ljava/lang/Enum;

    iput-wide p4, p0, La/i5n0;->d:J

    iput-byte p6, p0, La/i5n0;->e:B

    iput-boolean p7, p0, La/i5n0;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/i5n0;->a:B

    .line 2
    .line 3
    iget-byte v1, p0, La/i5n0;->e:B

    .line 4
    .line 5
    iget-object v2, p0, La/i5n0;->g:Ljava/lang/Enum;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v5, v2

    .line 11
    check-cast v5, La/vx3;

    .line 12
    .line 13
    move-object v8, p1

    .line 14
    check-cast v8, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 p1, v1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    iget-object v3, p0, La/i5n0;->b:La/mm40;

    .line 28
    .line 29
    iget-object v4, p0, La/i5n0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-wide v6, p0, La/i5n0;->d:J

    .line 32
    .line 33
    iget-boolean v10, p0, La/i5n0;->f:Z

    .line 34
    .line 35
    invoke-static/range {v3 .. v10}, La/k5n0;->a(La/mm40;Ljava/lang/String;La/vx3;JLa/fet;II)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast v2, La/ux3;

    .line 42
    .line 43
    move-object v5, p1

    .line 44
    check-cast v5, La/fet;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    or-int/lit8 p1, v1, 0x1

    .line 52
    .line 53
    invoke-static {p1}, La/x8x;->L(I)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    iget-object v0, p0, La/i5n0;->b:La/mm40;

    .line 58
    .line 59
    iget-object v1, p0, La/i5n0;->c:Ljava/lang/String;

    .line 60
    .line 61
    iget-wide v3, p0, La/i5n0;->d:J

    .line 62
    .line 63
    iget-boolean v7, p0, La/i5n0;->f:Z

    .line 64
    .line 65
    invoke-static/range {v0 .. v7}, La/j5n0;->d(La/mm40;Ljava/lang/String;La/ux3;JLa/fet;II)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
