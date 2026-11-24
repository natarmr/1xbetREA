.class public final synthetic La/fsn;
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

.field public final synthetic f:La/y9q0;

.field public final synthetic g:La/y9q0;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;JLa/y9q0;La/y9q0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/fsn;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fsn;->b:La/mm40;

    iput-object p2, p0, La/fsn;->c:Ljava/lang/String;

    iput-object p3, p0, La/fsn;->d:Ljava/lang/String;

    iput-wide p4, p0, La/fsn;->e:J

    iput-object p6, p0, La/fsn;->f:La/y9q0;

    iput-object p7, p0, La/fsn;->g:La/y9q0;

    iput p8, p0, La/fsn;->h:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;La/y9q0;La/y9q0;JI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/fsn;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fsn;->b:La/mm40;

    iput-object p2, p0, La/fsn;->c:Ljava/lang/String;

    iput-object p3, p0, La/fsn;->d:Ljava/lang/String;

    iput-object p4, p0, La/fsn;->f:La/y9q0;

    iput-object p5, p0, La/fsn;->g:La/y9q0;

    iput-wide p6, p0, La/fsn;->e:J

    iput p8, p0, La/fsn;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/fsn;->a:B

    .line 2
    .line 3
    iget v1, p0, La/fsn;->h:I

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
    move-result v2

    .line 22
    iget-wide v3, p0, La/fsn;->e:J

    .line 23
    .line 24
    iget-object v6, p0, La/fsn;->b:La/mm40;

    .line 25
    .line 26
    iget-object v7, p0, La/fsn;->f:La/y9q0;

    .line 27
    .line 28
    iget-object v8, p0, La/fsn;->g:La/y9q0;

    .line 29
    .line 30
    iget-object v9, p0, La/fsn;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v10, p0, La/fsn;->d:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static/range {v2 .. v10}, La/m8x;->d(IJLa/fet;La/mm40;La/y9q0;La/y9q0;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    move-object v3, p1

    .line 41
    check-cast v3, La/fet;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    or-int/lit8 p1, v1, 0x1

    .line 49
    .line 50
    invoke-static {p1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-wide v1, p0, La/fsn;->e:J

    .line 55
    .line 56
    iget-object v4, p0, La/fsn;->b:La/mm40;

    .line 57
    .line 58
    iget-object v5, p0, La/fsn;->f:La/y9q0;

    .line 59
    .line 60
    iget-object v6, p0, La/fsn;->g:La/y9q0;

    .line 61
    .line 62
    iget-object v7, p0, La/fsn;->c:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v8, p0, La/fsn;->d:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static/range {v0 .. v8}, La/lmc;->r(IJLa/fet;La/mm40;La/y9q0;La/y9q0;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
