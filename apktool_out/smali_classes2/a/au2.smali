.class public final synthetic La/au2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:F

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:F

.field public final synthetic f:J

.field public final synthetic g:F

.field public final synthetic h:La/ugd;

.field public final synthetic i:La/ugd;

.field public final synthetic j:B


# direct methods
.method public synthetic constructor <init>(La/mm40;FJJFJFLa/ugd;La/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/au2;->a:La/mm40;

    iput p2, p0, La/au2;->b:F

    iput-wide p3, p0, La/au2;->c:J

    iput-wide p5, p0, La/au2;->d:J

    iput p7, p0, La/au2;->e:F

    iput-wide p8, p0, La/au2;->f:J

    iput p10, p0, La/au2;->g:F

    iput-object p11, p0, La/au2;->h:La/ugd;

    iput-object p12, p0, La/au2;->i:La/ugd;

    iput-byte p14, p0, La/au2;->j:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    check-cast v12, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const v1, 0x36006001

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result v13

    .line 21
    iget-object v1, v0, La/au2;->a:La/mm40;

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    iget v1, v0, La/au2;->b:F

    .line 25
    .line 26
    move-object v4, v2

    .line 27
    iget-wide v2, v0, La/au2;->c:J

    .line 28
    .line 29
    move-object v6, v4

    .line 30
    iget-wide v4, v0, La/au2;->d:J

    .line 31
    .line 32
    move-object v7, v6

    .line 33
    iget v6, v0, La/au2;->e:F

    .line 34
    .line 35
    move-object v9, v7

    .line 36
    iget-wide v7, v0, La/au2;->f:J

    .line 37
    .line 38
    move-object v10, v9

    .line 39
    iget v9, v0, La/au2;->g:F

    .line 40
    .line 41
    move-object v11, v10

    .line 42
    iget-object v10, v0, La/au2;->h:La/ugd;

    .line 43
    .line 44
    move-object v14, v11

    .line 45
    iget-object v11, v0, La/au2;->i:La/ugd;

    .line 46
    .line 47
    iget-byte v0, v0, La/au2;->j:B

    .line 48
    .line 49
    move-object v15, v14

    .line 50
    move v14, v0

    .line 51
    move-object v0, v15

    .line 52
    invoke-static/range {v0 .. v14}, La/y0x0;->e(La/mm40;FJJFJFLa/ugd;La/ugd;La/fet;II)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0
.end method
