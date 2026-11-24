.class public final synthetic La/o1z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/weu;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/qzt;

.field public final synthetic d:La/ctf0;

.field public final synthetic e:La/fhj;

.field public final synthetic f:J

.field public final synthetic g:La/wyu;

.field public final synthetic h:I

.field public final synthetic i:La/n3q;


# direct methods
.method public synthetic constructor <init>(La/weu;Ljava/lang/String;La/qzt;La/ctf0;La/fhj;JLa/wyu;ILa/n3q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o1z;->a:La/weu;

    iput-object p2, p0, La/o1z;->b:Ljava/lang/String;

    iput-object p3, p0, La/o1z;->c:La/qzt;

    iput-object p4, p0, La/o1z;->d:La/ctf0;

    iput-object p5, p0, La/o1z;->e:La/fhj;

    iput-wide p6, p0, La/o1z;->f:J

    iput-object p8, p0, La/o1z;->g:La/wyu;

    iput p9, p0, La/o1z;->h:I

    iput-object p10, p0, La/o1z;->i:La/n3q;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/o1z;->a:La/weu;

    .line 2
    .line 3
    iget-object v2, p0, La/o1z;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v2}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, La/o1z;->c:La/qzt;

    .line 10
    .line 11
    invoke-virtual {v1}, La/qzt;->a()La/eme;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v3, p0, La/o1z;->d:La/ctf0;

    .line 16
    .line 17
    invoke-static {v0, v1, v3}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    iget-object v0, p0, La/o1z;->g:La/wyu;

    .line 22
    .line 23
    invoke-virtual {v0}, La/wyu;->a()La/uaq0;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    iget-object v1, p0, La/o1z;->e:La/fhj;

    .line 30
    .line 31
    iget-wide v3, p0, La/o1z;->f:J

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v7}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    sget-object v11, La/iun;->a:La/iun;

    .line 38
    .line 39
    new-instance v4, La/d1z;

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v13, 0x1

    .line 43
    const/4 v5, 0x1

    .line 44
    const/4 v6, 0x0

    .line 45
    iget v7, p0, La/o1z;->h:I

    .line 46
    .line 47
    iget-object v10, p0, La/o1z;->i:La/n3q;

    .line 48
    .line 49
    invoke-direct/range {v4 .. v13}, La/d1z;-><init>(ZZILa/zdm0;La/nc5;La/n3q;Ljava/util/List;La/hxs0;Z)V

    .line 50
    .line 51
    .line 52
    return-object v4
.end method
