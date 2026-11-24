.class public final La/j2u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/cu5;

.field public final b:La/j1q0;


# direct methods
.method public constructor <init>(La/cu5;La/j1q0;La/wsz;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/j2u;->a:La/cu5;

    .line 11
    .line 12
    iput-object p2, p0, La/j2u;->b:La/j1q0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;IZZZLa/zje;)Ljava/io/Serializable;
    .locals 10

    .line 1
    iget-object v0, p0, La/j2u;->b:La/j1q0;

    .line 2
    .line 3
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/m1q0;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v5

    .line 9
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, La/j2u;->a:La/cu5;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    move v3, p2

    .line 15
    move v4, p3

    .line 16
    move v7, p4

    .line 17
    move v8, p5

    .line 18
    move-object/from16 v9, p6

    .line 19
    .line 20
    invoke-virtual/range {v1 .. v9}, La/cu5;->m(Ljava/util/List;IZZLjava/lang/String;ZZLa/zje;)Ljava/io/Serializable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
