.class public final La/f310;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/x010;

.field public final b:La/svu;

.field public final c:La/knf0;

.field public final d:La/mne;


# direct methods
.method public constructor <init>(La/x010;La/svu;La/knf0;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/f310;->a:La/x010;

    .line 11
    .line 12
    iput-object p2, p0, La/f310;->b:La/svu;

    .line 13
    .line 14
    iput-object p3, p0, La/f310;->c:La/knf0;

    .line 15
    .line 16
    iput-object p4, p0, La/f310;->d:La/mne;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()La/i89;
    .locals 2

    .line 1
    iget-object p0, p0, La/f310;->a:La/x010;

    .line 2
    .line 3
    iget-object p0, p0, La/x010;->a:La/p7m0;

    .line 4
    .line 5
    new-instance v0, La/i89;

    .line 6
    .line 7
    const/16 v1, 0x16

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
