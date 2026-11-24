.class public final synthetic La/op8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/xpj0;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Z

.field public final synthetic e:La/yjj0;

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:F

.field public final synthetic i:Lkotlin/jvm/functions/Function2;

.field public final synthetic j:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/xpj0;FFZLa/yjj0;JJFLkotlin/jvm/functions/Function2;La/ugd;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/op8;->a:La/xpj0;

    iput p2, p0, La/op8;->b:F

    iput p3, p0, La/op8;->c:F

    iput-boolean p4, p0, La/op8;->d:Z

    iput-object p5, p0, La/op8;->e:La/yjj0;

    iput-wide p6, p0, La/op8;->f:J

    iput-wide p8, p0, La/op8;->g:J

    iput p10, p0, La/op8;->h:F

    iput-object p11, p0, La/op8;->i:Lkotlin/jvm/functions/Function2;

    iput-object p12, p0, La/op8;->j:La/ugd;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    .line 2
    check-cast v12, La/fet;

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
    const/4 v0, 0x1

    .line 12
    invoke-static {v0}, La/x8x;->L(I)I

    .line 13
    .line 14
    .line 15
    move-result v13

    .line 16
    iget-object v0, p0, La/op8;->a:La/xpj0;

    .line 17
    .line 18
    iget v1, p0, La/op8;->b:F

    .line 19
    .line 20
    iget v2, p0, La/op8;->c:F

    .line 21
    .line 22
    iget-boolean v3, p0, La/op8;->d:Z

    .line 23
    .line 24
    iget-object v4, p0, La/op8;->e:La/yjj0;

    .line 25
    .line 26
    iget-wide v5, p0, La/op8;->f:J

    .line 27
    .line 28
    iget-wide v7, p0, La/op8;->g:J

    .line 29
    .line 30
    iget v9, p0, La/op8;->h:F

    .line 31
    .line 32
    iget-object v10, p0, La/op8;->i:Lkotlin/jvm/functions/Function2;

    .line 33
    .line 34
    iget-object v11, p0, La/op8;->j:La/ugd;

    .line 35
    .line 36
    invoke-static/range {v0 .. v13}, La/epv0;->H(La/xpj0;FFZLa/yjj0;JJFLkotlin/jvm/functions/Function2;La/ugd;La/fet;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0
.end method
