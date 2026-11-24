.class public final synthetic La/bmq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:La/y9q0;

.field public final synthetic c:F

.field public final synthetic d:La/mm40;

.field public final synthetic e:La/yjj0;

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:La/slq;

.field public final synthetic i:La/ugd;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;La/y9q0;FLa/mm40;La/yjj0;JJLa/slq;La/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bmq;->a:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, La/bmq;->b:La/y9q0;

    iput p3, p0, La/bmq;->c:F

    iput-object p4, p0, La/bmq;->d:La/mm40;

    iput-object p5, p0, La/bmq;->e:La/yjj0;

    iput-wide p6, p0, La/bmq;->f:J

    iput-wide p8, p0, La/bmq;->g:J

    iput-object p10, p0, La/bmq;->h:La/slq;

    iput-object p11, p0, La/bmq;->i:La/ugd;

    iput p12, p0, La/bmq;->j:I

    iput p13, p0, La/bmq;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, La/fet;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, La/bmq;->j:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-static {v0}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    iget v0, p0, La/bmq;->k:I

    .line 20
    .line 21
    invoke-static {v0}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    iget-object v0, p0, La/bmq;->a:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    iget-object v1, p0, La/bmq;->b:La/y9q0;

    .line 28
    .line 29
    iget v2, p0, La/bmq;->c:F

    .line 30
    .line 31
    iget-object v3, p0, La/bmq;->d:La/mm40;

    .line 32
    .line 33
    iget-object v4, p0, La/bmq;->e:La/yjj0;

    .line 34
    .line 35
    iget-wide v5, p0, La/bmq;->f:J

    .line 36
    .line 37
    iget-wide v7, p0, La/bmq;->g:J

    .line 38
    .line 39
    iget-object v9, p0, La/bmq;->h:La/slq;

    .line 40
    .line 41
    iget-object v10, p0, La/bmq;->i:La/ugd;

    .line 42
    .line 43
    invoke-static/range {v0 .. v13}, La/dmq;->b(Lkotlin/jvm/functions/Function0;La/y9q0;FLa/mm40;La/yjj0;JJLa/slq;La/ugd;La/fet;II)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0
.end method
