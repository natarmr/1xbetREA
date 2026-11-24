.class public final synthetic La/v13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/ye60;

.field public final synthetic b:Z

.field public final synthetic c:La/xsf0;

.field public final synthetic d:Z

.field public final synthetic e:J

.field public final synthetic f:F

.field public final synthetic g:La/mm40;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/ye60;ZLa/xsf0;ZJFLa/mm40;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v13;->a:La/ye60;

    iput-boolean p2, p0, La/v13;->b:Z

    iput-object p3, p0, La/v13;->c:La/xsf0;

    iput-boolean p4, p0, La/v13;->d:Z

    iput-wide p5, p0, La/v13;->e:J

    iput p7, p0, La/v13;->f:F

    iput-object p8, p0, La/v13;->g:La/mm40;

    iput p9, p0, La/v13;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/v13;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, La/v13;->a:La/ye60;

    .line 18
    .line 19
    iget-boolean v1, p0, La/v13;->b:Z

    .line 20
    .line 21
    iget-object v2, p0, La/v13;->c:La/xsf0;

    .line 22
    .line 23
    iget-boolean v3, p0, La/v13;->d:Z

    .line 24
    .line 25
    iget-wide v4, p0, La/v13;->e:J

    .line 26
    .line 27
    iget v6, p0, La/v13;->f:F

    .line 28
    .line 29
    iget-object v7, p0, La/v13;->g:La/mm40;

    .line 30
    .line 31
    invoke-static/range {v0 .. v9}, La/eeq;->E(La/ye60;ZLa/xsf0;ZJFLa/mm40;La/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
