.class public final synthetic La/r8r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pu90;

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:La/pu90;

.field public final synthetic e:La/pu90;

.field public final synthetic f:I

.field public final synthetic g:La/pu90;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/pu90;JILa/pu90;La/pu90;ILa/pu90;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r8r0;->a:La/pu90;

    iput-wide p2, p0, La/r8r0;->b:J

    iput p4, p0, La/r8r0;->c:I

    iput-object p5, p0, La/r8r0;->d:La/pu90;

    iput-object p6, p0, La/r8r0;->e:La/pu90;

    iput p7, p0, La/r8r0;->f:I

    iput-object p8, p0, La/r8r0;->g:La/pu90;

    iput p9, p0, La/r8r0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, La/ou90;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    iget-object v2, p0, La/r8r0;->a:La/pu90;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-wide v3, p0, La/r8r0;->b:J

    .line 13
    .line 14
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget v4, p0, La/r8r0;->c:I

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    invoke-virtual {p1, v2, v3, v1, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v2, p0, La/r8r0;->d:La/pu90;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1, v1, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, La/r8r0;->e:La/pu90;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget v3, p0, La/r8r0;->f:I

    .line 36
    .line 37
    invoke-virtual {p1, v2, v1, v3, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v2, p0, La/r8r0;->g:La/pu90;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    iget p0, p0, La/r8r0;->h:I

    .line 45
    .line 46
    invoke-virtual {p1, v2, v1, p0, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 47
    .line 48
    .line 49
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0
.end method
