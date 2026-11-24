.class public final La/ycu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/zcu;

.field public final b:La/ntu;


# direct methods
.method public constructor <init>(La/zcu;La/ntu;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ycu;->a:La/zcu;

    .line 8
    .line 9
    iput-object p2, p0, La/ycu;->b:La/ntu;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/ycu;->b:La/ntu;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ntu;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    iget-object p0, p0, La/ycu;->a:La/zcu;

    .line 8
    .line 9
    iget-object v1, p0, La/zcu;->a:La/pbt;

    .line 10
    .line 11
    iget-object p0, p0, La/zcu;->b:La/gst0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/gst0;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    move-wide v2, p1

    .line 18
    move-object v4, p3

    .line 19
    invoke-virtual/range {v1 .. v6}, La/pbt;->i(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
