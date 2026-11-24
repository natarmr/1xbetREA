.class public final synthetic La/ojf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:La/yjj0;

.field public final synthetic e:J

.field public final synthetic f:La/hd9;

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:I

.field public final synthetic i:La/tcj;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(La/mm40;FFLa/yjj0;JLa/hd9;Ljava/util/List;ILa/tcj;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ojf0;->a:La/mm40;

    iput p2, p0, La/ojf0;->b:F

    iput p3, p0, La/ojf0;->c:F

    iput-object p4, p0, La/ojf0;->d:La/yjj0;

    iput-wide p5, p0, La/ojf0;->e:J

    iput-object p7, p0, La/ojf0;->f:La/hd9;

    iput-object p8, p0, La/ojf0;->g:Ljava/util/List;

    iput p9, p0, La/ojf0;->h:I

    iput-object p10, p0, La/ojf0;->i:La/tcj;

    iput p11, p0, La/ojf0;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/ojf0;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget-object v0, p0, La/ojf0;->a:La/mm40;

    .line 18
    .line 19
    iget v1, p0, La/ojf0;->b:F

    .line 20
    .line 21
    iget v2, p0, La/ojf0;->c:F

    .line 22
    .line 23
    iget-object v3, p0, La/ojf0;->d:La/yjj0;

    .line 24
    .line 25
    iget-wide v4, p0, La/ojf0;->e:J

    .line 26
    .line 27
    iget-object v6, p0, La/ojf0;->f:La/hd9;

    .line 28
    .line 29
    iget-object v7, p0, La/ojf0;->g:Ljava/util/List;

    .line 30
    .line 31
    iget v8, p0, La/ojf0;->h:I

    .line 32
    .line 33
    iget-object v9, p0, La/ojf0;->i:La/tcj;

    .line 34
    .line 35
    invoke-static/range {v0 .. v11}, La/idx;->k(La/mm40;FFLa/yjj0;JLa/hd9;Ljava/util/List;ILa/tcj;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0
.end method
